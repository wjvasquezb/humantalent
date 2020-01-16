package com.ingeint.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.MBPartner;
import org.compiere.model.MSysConfig;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.util.DB;

import com.ingeint.base.CustomProcess;
import com.ingeint.utils.Utils;

public class NotifyExpireTestEmployee extends CustomProcess {

	Integer AD_Org_ID = 0;

	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null);
			else if (name.equals("ContractType")) 
				AD_Org_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}

	@Override
	protected String doIt() throws Exception {

		StringBuffer sql = new StringBuffer("SELECT c_bpartner_id, days, startdate, enddate, toexpire, responsable_ID "
				+ "FROM ING_EmployeeToExpire WHERE AD_Client_ID = ? AND days > 0 AND IsNotified = 'N' ");

		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), get_TrxName());
			pstmt.setInt(1, getAD_Client_ID());
			ResultSet rs = pstmt.executeQuery();
			//

			while (rs.next())  {

				MBPartner partner = new MBPartner(getCtx(), rs.getInt(1), get_TrxName());
				Integer RequestType_ID = MSysConfig.getIntValue("RequestTypeForEmployeeExpire", 0,getAD_Client_ID(),partner.getAD_Org_ID());

				if (RequestType_ID==0)
					throw new AdempiereException("Debe configurar el tipo de solicitud, en el Sysconfig RequestTypeForEmployeeExpire ");

				StringBuffer content = new StringBuffer("El Empleado esta por vencer su periodo de prueba, ");
				content.append("le restan "+rs.getString(2));
				content.append(" dias, valide la informacion para : "+partner.getName()+" Cedula # "+partner.getTaxID());
				
				Integer Responsable_ID = rs.getInt(6);
				
				if (Responsable_ID==-1)
					Responsable_ID = MSysConfig.getIntValue("ResponsableForEmployeeExpire", 0, getAD_Client_ID(), partner.getAD_Org_ID());

				String result = Utils.createRequest(getCtx(), partner.getAD_Org_ID(), partner.get_Table_ID(), partner.get_ID(), RequestType_ID,
						content.toString(), Responsable_ID, partner.get_ID(), false, get_TrxName());
				
				if (result.length()>0) {
					partner.set_ValueOfColumn("IsNotified", true);
					partner.saveEx();
				}				
			}

			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
			return "Error en el proceso de creacion de notificacion: "+e.toString();
		}
		return null;
	}
}
