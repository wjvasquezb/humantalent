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
package com.ingeint.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for HT_PersonalRequisiton
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
public class X_HT_PersonalRequisiton extends PO implements I_HT_PersonalRequisiton, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20180706L;

    /** Standard Constructor */
    public X_HT_PersonalRequisiton (Properties ctx, int HT_PersonalRequisiton_ID, String trxName)
    {
      super (ctx, HT_PersonalRequisiton_ID, trxName);
      /** if (HT_PersonalRequisiton_ID == 0)
        {
			setHT_PersonalRequisiton_ID (0);
        } */
    }

    /** Load Constructor */
    public X_HT_PersonalRequisiton (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HT_PersonalRequisiton[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getAD_User_ID(), get_TrxName());	}

	/** Set User/Contact.
		@param AD_User_ID 
		User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set EstimatedSalary.
		@param EstimatedSalary EstimatedSalary	  */
	public void setEstimatedSalary (BigDecimal EstimatedSalary)
	{
		set_Value (COLUMNNAME_EstimatedSalary, EstimatedSalary);
	}

	/** Get EstimatedSalary.
		@return EstimatedSalary	  */
	public BigDecimal getEstimatedSalary () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_EstimatedSalary);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public org.eevolution.model.I_HR_Department getHR_Department() throws RuntimeException
    {
		return (org.eevolution.model.I_HR_Department)MTable.get(getCtx(), org.eevolution.model.I_HR_Department.Table_Name)
			.getPO(getHR_Department_ID(), get_TrxName());	}

	/** Set Payroll Department.
		@param HR_Department_ID Payroll Department	  */
	public void setHR_Department_ID (int HR_Department_ID)
	{
		if (HR_Department_ID < 1) 
			set_Value (COLUMNNAME_HR_Department_ID, null);
		else 
			set_Value (COLUMNNAME_HR_Department_ID, Integer.valueOf(HR_Department_ID));
	}

	/** Get Payroll Department.
		@return Payroll Department	  */
	public int getHR_Department_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HR_Department_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set HTLoadProspect.
		@param HTLoadProspect HTLoadProspect	  */
	public void setHTLoadProspect (String HTLoadProspect)
	{
		set_Value (COLUMNNAME_HTLoadProspect, HTLoadProspect);
	}

	/** Get HTLoadProspect.
		@return HTLoadProspect	  */
	public String getHTLoadProspect () 
	{
		return (String)get_Value(COLUMNNAME_HTLoadProspect);
	}

	/** Set Career.
		@param HT_Career2_ID Career	  */
	public void setHT_Career2_ID (int HT_Career2_ID)
	{
		if (HT_Career2_ID < 1) 
			set_Value (COLUMNNAME_HT_Career2_ID, null);
		else 
			set_Value (COLUMNNAME_HT_Career2_ID, Integer.valueOf(HT_Career2_ID));
	}

	/** Get Career.
		@return Career	  */
	public int getHT_Career2_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HT_Career2_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Career 3.
		@param HT_Career3_ID Career 3	  */
	public void setHT_Career3_ID (int HT_Career3_ID)
	{
		if (HT_Career3_ID < 1) 
			set_Value (COLUMNNAME_HT_Career3_ID, null);
		else 
			set_Value (COLUMNNAME_HT_Career3_ID, Integer.valueOf(HT_Career3_ID));
	}

	/** Get Career 3.
		@return Career 3	  */
	public int getHT_Career3_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HT_Career3_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Career.
		@param HT_Career_ID Career	  */
	public void setHT_Career_ID (int HT_Career_ID)
	{
		if (HT_Career_ID < 1) 
			set_Value (COLUMNNAME_HT_Career_ID, null);
		else 
			set_Value (COLUMNNAME_HT_Career_ID, Integer.valueOf(HT_Career_ID));
	}

	/** Get Career.
		@return Career	  */
	public int getHT_Career_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HT_Career_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HT_PersonalRequisiton.
		@param HT_PersonalRequisiton_ID HT_PersonalRequisiton	  */
	public void setHT_PersonalRequisiton_ID (int HT_PersonalRequisiton_ID)
	{
		if (HT_PersonalRequisiton_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HT_PersonalRequisiton_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HT_PersonalRequisiton_ID, Integer.valueOf(HT_PersonalRequisiton_ID));
	}

	/** Get HT_PersonalRequisiton.
		@return HT_PersonalRequisiton	  */
	public int getHT_PersonalRequisiton_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HT_PersonalRequisiton_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HT_PersonalRequisiton_UU.
		@param HT_PersonalRequisiton_UU HT_PersonalRequisiton_UU	  */
	public void setHT_PersonalRequisiton_UU (String HT_PersonalRequisiton_UU)
	{
		set_Value (COLUMNNAME_HT_PersonalRequisiton_UU, HT_PersonalRequisiton_UU);
	}

	/** Get HT_PersonalRequisiton_UU.
		@return HT_PersonalRequisiton_UU	  */
	public String getHT_PersonalRequisiton_UU () 
	{
		return (String)get_Value(COLUMNNAME_HT_PersonalRequisiton_UU);
	}

	/** Set Comment/Help.
		@param Help 
		Comment or Hint
	  */
	public void setHelp (String Help)
	{
		set_Value (COLUMNNAME_Help, Help);
	}

	/** Get Comment/Help.
		@return Comment or Hint
	  */
	public String getHelp () 
	{
		return (String)get_Value(COLUMNNAME_Help);
	}

	/** Set Request Date.
		@param RequestDate Request Date	  */
	public void setRequestDate (Timestamp RequestDate)
	{
		set_Value (COLUMNNAME_RequestDate, RequestDate);
	}

	/** Get Request Date.
		@return Request Date	  */
	public Timestamp getRequestDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_RequestDate);
	}

	/** Set Vacancies Number.
		@param VacanciesNumber Vacancies Number	  */
	public void setVacanciesNumber (int VacanciesNumber)
	{
		set_Value (COLUMNNAME_VacanciesNumber, Integer.valueOf(VacanciesNumber));
	}

	/** Get Vacancies Number.
		@return Vacancies Number	  */
	public int getVacanciesNumber () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_VacanciesNumber);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}