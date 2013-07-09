/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package ve.net.dcs.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for HT_EvaluationEmployee
 *  @author iDempiere (generated) 
 *  @version Release 1.0b - $Id$ */
public class X_HT_EvaluationEmployee extends PO implements I_HT_EvaluationEmployee, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20130709L;

    /** Standard Constructor */
    public X_HT_EvaluationEmployee (Properties ctx, int HT_EvaluationEmployee_ID, String trxName)
    {
      super (ctx, HT_EvaluationEmployee_ID, trxName);
      /** if (HT_EvaluationEmployee_ID == 0)
        {
			setC_BPartner_ID (0);
			setDate1 (new Timestamp( System.currentTimeMillis() ));
			setHR_Job_ID (0);
			setHT_EvaluationEmployee_ID (0);
			setHT_Evaluation_ID (0);
			setObjective (null);
			setPercentage (Env.ZERO);
			setSalary (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_HT_EvaluationEmployee (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_HT_EvaluationEmployee[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_ID(), get_TrxName());	}

	/** Set Business Partner .
		@param C_BPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner .
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Comments.
		@param Comments 
		Comments or additional information
	  */
	public void setComments (String Comments)
	{
		set_Value (COLUMNNAME_Comments, Comments);
	}

	/** Get Comments.
		@return Comments or additional information
	  */
	public String getComments () 
	{
		return (String)get_Value(COLUMNNAME_Comments);
	}

	/** Set Date.
		@param Date1 
		Date when business is not conducted
	  */
	public void setDate1 (Timestamp Date1)
	{
		set_Value (COLUMNNAME_Date1, Date1);
	}

	/** Get Date.
		@return Date when business is not conducted
	  */
	public Timestamp getDate1 () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Date1);
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	public org.eevolution.model.I_HR_Job getHR_Job() throws RuntimeException
    {
		return (org.eevolution.model.I_HR_Job)MTable.get(getCtx(), org.eevolution.model.I_HR_Job.Table_Name)
			.getPO(getHR_Job_ID(), get_TrxName());	}

	/** Set Payroll Job.
		@param HR_Job_ID Payroll Job	  */
	public void setHR_Job_ID (int HR_Job_ID)
	{
		if (HR_Job_ID < 1) 
			set_Value (COLUMNNAME_HR_Job_ID, null);
		else 
			set_Value (COLUMNNAME_HR_Job_ID, Integer.valueOf(HR_Job_ID));
	}

	/** Get Payroll Job.
		@return Payroll Job	  */
	public int getHR_Job_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HR_Job_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Evaluation Employee.
		@param HT_EvaluationEmployee_ID Evaluation Employee	  */
	public void setHT_EvaluationEmployee_ID (int HT_EvaluationEmployee_ID)
	{
		if (HT_EvaluationEmployee_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HT_EvaluationEmployee_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HT_EvaluationEmployee_ID, Integer.valueOf(HT_EvaluationEmployee_ID));
	}

	/** Get Evaluation Employee.
		@return Evaluation Employee	  */
	public int getHT_EvaluationEmployee_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HT_EvaluationEmployee_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HT_EvaluationEmployee_UU.
		@param HT_EvaluationEmployee_UU HT_EvaluationEmployee_UU	  */
	public void setHT_EvaluationEmployee_UU (String HT_EvaluationEmployee_UU)
	{
		set_Value (COLUMNNAME_HT_EvaluationEmployee_UU, HT_EvaluationEmployee_UU);
	}

	/** Get HT_EvaluationEmployee_UU.
		@return HT_EvaluationEmployee_UU	  */
	public String getHT_EvaluationEmployee_UU () 
	{
		return (String)get_Value(COLUMNNAME_HT_EvaluationEmployee_UU);
	}

	public ve.net.dcs.model.I_HT_Evaluation getHT_Evaluation() throws RuntimeException
    {
		return (ve.net.dcs.model.I_HT_Evaluation)MTable.get(getCtx(), ve.net.dcs.model.I_HT_Evaluation.Table_Name)
			.getPO(getHT_Evaluation_ID(), get_TrxName());	}

	/** Set Evaluation.
		@param HT_Evaluation_ID Evaluation	  */
	public void setHT_Evaluation_ID (int HT_Evaluation_ID)
	{
		if (HT_Evaluation_ID < 1) 
			set_Value (COLUMNNAME_HT_Evaluation_ID, null);
		else 
			set_Value (COLUMNNAME_HT_Evaluation_ID, Integer.valueOf(HT_Evaluation_ID));
	}

	/** Get Evaluation.
		@return Evaluation	  */
	public int getHT_Evaluation_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HT_Evaluation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Objective.
		@param Objective 
		Objective
	  */
	public void setObjective (String Objective)
	{
		set_Value (COLUMNNAME_Objective, Objective);
	}

	/** Get Objective.
		@return Objective
	  */
	public String getObjective () 
	{
		return (String)get_Value(COLUMNNAME_Objective);
	}

	/** Set Percentage.
		@param Percentage 
		Percent of the entire amount
	  */
	public void setPercentage (BigDecimal Percentage)
	{
		set_Value (COLUMNNAME_Percentage, Percentage);
	}

	/** Get Percentage.
		@return Percent of the entire amount
	  */
	public BigDecimal getPercentage () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Percentage);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Salary.
		@param Salary 
		Sueldo
	  */
	public void setSalary (BigDecimal Salary)
	{
		set_Value (COLUMNNAME_Salary, Salary);
	}

	/** Get Salary.
		@return Sueldo
	  */
	public BigDecimal getSalary () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Salary);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Strengths.
		@param Strengths 
		Strengths
	  */
	public void setStrengths (String Strengths)
	{
		set_Value (COLUMNNAME_Strengths, Strengths);
	}

	/** Get Strengths.
		@return Strengths
	  */
	public String getStrengths () 
	{
		return (String)get_Value(COLUMNNAME_Strengths);
	}

	/** Set Weaknesses.
		@param Weaknesses 
		Weaknesses
	  */
	public void setWeaknesses (String Weaknesses)
	{
		set_Value (COLUMNNAME_Weaknesses, Weaknesses);
	}

	/** Get Weaknesses.
		@return Weaknesses
	  */
	public String getWeaknesses () 
	{
		return (String)get_Value(COLUMNNAME_Weaknesses);
	}
}