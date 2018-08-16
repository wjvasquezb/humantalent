package com.ingeint.process;

import java.sql.Timestamp;
import java.util.List;
import java.util.logging.Level;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.MBPartner;
import org.compiere.model.MRequest;
import org.compiere.model.MSysConfig;
import org.compiere.model.Query;
import org.compiere.process.ProcessInfoParameter;
import org.eevolution.model.X_HR_Attribute;
import org.eevolution.model.X_HR_Employee;
import org.eevolution.model.X_HR_Payroll;

import com.ingeint.base.CustomProcess;
import com.ingeint.model.MHTJobEndowment;
import com.ingeint.model.MHTPersonalRequisition;
import com.ingeint.model.MHTPersonalRequisitionLine;

import ve.net.dcs.model.X_HT_EndowmentEmployee;

public class CreateEmployee extends CustomProcess {
	
	String p_ContractType="";
	Timestamp p_StartDate=null;
	String p_HRegion = "";
	

	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null);
			else if (name.equals("ContractType")) 
				p_ContractType = para[i].getParameterAsString();
			else if (name.equals("StartDate"))
				p_StartDate = para[i].getParameterAsTimestamp();
			else if (name.equals("HR_Region"))
				p_HRegion = para[i].getParameterAsString();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}

	@Override
	protected String doIt() throws Exception {
		
		MRequest req = new MRequest(getCtx(), getRecord_ID(), get_TrxName());
		MHTPersonalRequisitionLine reqline = new MHTPersonalRequisitionLine(getCtx(), req.get_ValueAsInt("HT_PersonalRequisitonLine_ID"), get_TrxName());
		MHTPersonalRequisition requisition = new MHTPersonalRequisition(getCtx(), reqline.getHT_PersonalRequisiton_ID(), get_TrxName());
		MBPartner partner = new MBPartner(getCtx(), reqline.getC_BPartner_ID(), get_TrxName());
		partner.setIsEmployee(true);
		partner.set_ValueOfColumn("HT_PersonalRequisiton_ID", requisition.get_ID());
		partner.set_ValueOfColumn("ContractType", p_ContractType);
		partner.set_ValueOfColumn("IsHRProspect", false);
		partner.set_ValueOfColumn("StartDate", p_StartDate);
		partner.saveEx();
		
		
		MHTJobEndowment[] je = MHTJobEndowment.getJobEndowment(requisition.getCtx(),requisition.getHR_Job_ID(),requisition.get_TrxName());
		
		for (MHTJobEndowment jobe : je) {
			
			X_HT_EndowmentEmployee ee = new X_HT_EndowmentEmployee(getCtx(), 0, get_TrxName());
			ee.setC_BPartner_ID(partner.get_ID());
			ee.setHT_ArticleOfEndowment_ID(jobe.getHT_ArticleOfEndowment_ID());
			ee.setQty(1);
			ee.setAD_Org_ID(partner.getAD_Org_ID());
			ee.saveEx();			
		}	
		
		Integer SalaryConcept = MSysConfig.getIntValue("HR_SalaryConcept", 0,requisition.getAD_Client_ID(), partner.getAD_Org_ID());
		
		if (SalaryConcept==0)
			throw new AdempiereException("Por favor configure el Salario de Concepto");
			
			X_HR_Attribute attribute = new X_HR_Attribute(getCtx(), 0, get_TrxName());
			
			attribute.setAD_Org_ID(partner.getAD_Org_ID());
			attribute.setHR_Concept_ID(SalaryConcept);
			attribute.setC_BPartner_ID(partner.get_ID());
			attribute.setValidFrom(p_StartDate);
			attribute.setColumnType("A");
			attribute.setAmount(requisition.getEstimatedSalary());
			attribute.set_ValueOfColumn("HR_Region", p_HRegion);
			attribute.saveEx();					
				
		List<X_HR_Payroll> xpayrolls = new Query(getCtx(), X_HR_Payroll.Table_Name,
				"HR_Region IN (?,'AM') "
				+ "AND AD_Client_ID = ? ",
				get_TrxName())
				.setParameters(p_HRegion, getAD_Client_ID())
				.list();
		
		for (X_HR_Payroll xpayroll:xpayrolls) {
			X_HR_Employee employee = new X_HR_Employee(getCtx(), 0, get_TrxName());
			
			employee.setC_BPartner_ID(partner.get_ID());
			employee.setAD_Org_ID(partner.getAD_Org_ID());
			employee.setStartDate(p_StartDate);
			employee.setHR_Department_ID(requisition.getHR_Department_ID());
			employee.setHR_Job_ID(requisition.getHR_Job_ID());
			employee.set_ValueOfColumn("HR_Region",p_HRegion);
			employee.setHR_Payroll_ID(xpayroll.getHR_Payroll_ID());
			employee.saveEx();			
		}		
		return "Empleado creado";
	}
}
