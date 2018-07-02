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

/** Generated Model for HT_WorkExperienceEmployee
 *  @author iDempiere (generated) 
 *  @version Release 1.0b - $Id$ */
public class X_HT_WorkExperienceEmployee extends PO implements I_HT_WorkExperienceEmployee, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20130709L;

    /** Standard Constructor */
    public X_HT_WorkExperienceEmployee (Properties ctx, int HT_WorkExperienceEmployee_ID, String trxName)
    {
      super (ctx, HT_WorkExperienceEmployee_ID, trxName);
      /** if (HT_WorkExperienceEmployee_ID == 0)
        {
			setC_BPartner_ID (0);
			setHT_Occupation_ID (0);
			setHT_WorkExperienceEmployee_ID (0);
			setSalary (Env.ZERO);
			setStartDate (new Timestamp( System.currentTimeMillis() ));
        } */
    }

    /** Load Constructor */
    public X_HT_WorkExperienceEmployee (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HT_WorkExperienceEmployee[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Address.
		@param Address Address	  */
	public void setAddress (String Address)
	{
		set_Value (COLUMNNAME_Address, Address);
	}

	/** Get Address.
		@return Address	  */
	public String getAddress () 
	{
		return (String)get_Value(COLUMNNAME_Address);
	}

	/** Set Boss.
		@param Boss 
		Boss
	  */
	public void setBoss (String Boss)
	{
		set_Value (COLUMNNAME_Boss, Boss);
	}

	/** Get Boss.
		@return Boss
	  */
	public String getBoss () 
	{
		return (String)get_Value(COLUMNNAME_Boss);
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

	/** Set Company.
		@param Company 
		Company
	  */
	public void setCompany (String Company)
	{
		set_Value (COLUMNNAME_Company, Company);
	}

	/** Get Company.
		@return Company
	  */
	public String getCompany () 
	{
		return (String)get_Value(COLUMNNAME_Company);
	}

	/** Set Current Employment.
		@param CurrentEmployment 
		Current Employment
	  */
	public void setCurrentEmployment (boolean CurrentEmployment)
	{
		set_Value (COLUMNNAME_CurrentEmployment, Boolean.valueOf(CurrentEmployment));
	}

	/** Get Current Employment.
		@return Current Employment
	  */
	public boolean isCurrentEmployment () 
	{
		Object oo = get_Value(COLUMNNAME_CurrentEmployment);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set End Date.
		@param EndDate 
		Last effective date (inclusive)
	  */
	public void setEndDate (Timestamp EndDate)
	{
		set_Value (COLUMNNAME_EndDate, EndDate);
	}

	/** Get End Date.
		@return Last effective date (inclusive)
	  */
	public Timestamp getEndDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_EndDate);
	}

	/** Set Functions.
		@param Functions 
		Funcions
	  */
	public void setFunctions (String Functions)
	{
		set_Value (COLUMNNAME_Functions, Functions);
	}

	/** Get Functions.
		@return Funcions
	  */
	public String getFunctions () 
	{
		return (String)get_Value(COLUMNNAME_Functions);
	}

	public ve.net.dcs.model.I_HT_Occupation getHT_Occupation() throws RuntimeException
    {
		return (ve.net.dcs.model.I_HT_Occupation)MTable.get(getCtx(), ve.net.dcs.model.I_HT_Occupation.Table_Name)
			.getPO(getHT_Occupation_ID(), get_TrxName());	}

	/** Set Occupation.
		@param HT_Occupation_ID Occupation	  */
	public void setHT_Occupation_ID (int HT_Occupation_ID)
	{
		if (HT_Occupation_ID < 1) 
			set_Value (COLUMNNAME_HT_Occupation_ID, null);
		else 
			set_Value (COLUMNNAME_HT_Occupation_ID, Integer.valueOf(HT_Occupation_ID));
	}

	/** Get Occupation.
		@return Occupation	  */
	public int getHT_Occupation_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HT_Occupation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Work Experience Employee.
		@param HT_WorkExperienceEmployee_ID Work Experience Employee	  */
	public void setHT_WorkExperienceEmployee_ID (int HT_WorkExperienceEmployee_ID)
	{
		if (HT_WorkExperienceEmployee_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HT_WorkExperienceEmployee_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HT_WorkExperienceEmployee_ID, Integer.valueOf(HT_WorkExperienceEmployee_ID));
	}

	/** Get Work Experience Employee.
		@return Work Experience Employee	  */
	public int getHT_WorkExperienceEmployee_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HT_WorkExperienceEmployee_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HT_WorkExperienceEmployee_UU.
		@param HT_WorkExperienceEmployee_UU HT_WorkExperienceEmployee_UU	  */
	public void setHT_WorkExperienceEmployee_UU (String HT_WorkExperienceEmployee_UU)
	{
		set_Value (COLUMNNAME_HT_WorkExperienceEmployee_UU, HT_WorkExperienceEmployee_UU);
	}

	/** Get HT_WorkExperienceEmployee_UU.
		@return HT_WorkExperienceEmployee_UU	  */
	public String getHT_WorkExperienceEmployee_UU () 
	{
		return (String)get_Value(COLUMNNAME_HT_WorkExperienceEmployee_UU);
	}

	/** Set Motive Of Exit.
		@param MotiveOfExit 
		Motive Of Exit
	  */
	public void setMotiveOfExit (String MotiveOfExit)
	{
		set_Value (COLUMNNAME_MotiveOfExit, MotiveOfExit);
	}

	/** Get Motive Of Exit.
		@return Motive Of Exit
	  */
	public String getMotiveOfExit () 
	{
		return (String)get_Value(COLUMNNAME_MotiveOfExit);
	}

	/** Set Phone.
		@param Phone 
		Identifies a telephone number
	  */
	public void setPhone (String Phone)
	{
		set_Value (COLUMNNAME_Phone, Phone);
	}

	/** Get Phone.
		@return Identifies a telephone number
	  */
	public String getPhone () 
	{
		return (String)get_Value(COLUMNNAME_Phone);
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

	/** Set Start Date.
		@param StartDate 
		First effective day (inclusive)
	  */
	public void setStartDate (Timestamp StartDate)
	{
		set_Value (COLUMNNAME_StartDate, StartDate);
	}

	/** Get Start Date.
		@return First effective day (inclusive)
	  */
	public Timestamp getStartDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_StartDate);
	}
}