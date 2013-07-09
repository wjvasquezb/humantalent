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

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for HT_AcademicTrainingEmployee
 *  @author iDempiere (generated) 
 *  @version Release 1.0b - $Id$ */
public class X_HT_AcademicTrainingEmployee extends PO implements I_HT_AcademicTrainingEmployee, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20130709L;

    /** Standard Constructor */
    public X_HT_AcademicTrainingEmployee (Properties ctx, int HT_AcademicTrainingEmployee_ID, String trxName)
    {
      super (ctx, HT_AcademicTrainingEmployee_ID, trxName);
      /** if (HT_AcademicTrainingEmployee_ID == 0)
        {
			setC_BPartner_ID (0);
			setHT_AcademicTrainingEmployee_ID (0);
			setHT_Career_ID (0);
			setHT_DegreeOfApproval_ID (0);
			setHT_InstituteUniversity_ID (0);
			setHT_TitleObtained_ID (0);
			setStartDate (new Timestamp( System.currentTimeMillis() ));
        } */
    }

    /** Load Constructor */
    public X_HT_AcademicTrainingEmployee (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HT_AcademicTrainingEmployee[")
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

	/** Set Academic Training Employee.
		@param HT_AcademicTrainingEmployee_ID Academic Training Employee	  */
	public void setHT_AcademicTrainingEmployee_ID (int HT_AcademicTrainingEmployee_ID)
	{
		if (HT_AcademicTrainingEmployee_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HT_AcademicTrainingEmployee_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HT_AcademicTrainingEmployee_ID, Integer.valueOf(HT_AcademicTrainingEmployee_ID));
	}

	/** Get Academic Training Employee.
		@return Academic Training Employee	  */
	public int getHT_AcademicTrainingEmployee_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HT_AcademicTrainingEmployee_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HT_AcademicTrainingEmployee_UU.
		@param HT_AcademicTrainingEmployee_UU HT_AcademicTrainingEmployee_UU	  */
	public void setHT_AcademicTrainingEmployee_UU (String HT_AcademicTrainingEmployee_UU)
	{
		set_Value (COLUMNNAME_HT_AcademicTrainingEmployee_UU, HT_AcademicTrainingEmployee_UU);
	}

	/** Get HT_AcademicTrainingEmployee_UU.
		@return HT_AcademicTrainingEmployee_UU	  */
	public String getHT_AcademicTrainingEmployee_UU () 
	{
		return (String)get_Value(COLUMNNAME_HT_AcademicTrainingEmployee_UU);
	}

	public ve.net.dcs.model.I_HT_Career getHT_Career() throws RuntimeException
    {
		return (ve.net.dcs.model.I_HT_Career)MTable.get(getCtx(), ve.net.dcs.model.I_HT_Career.Table_Name)
			.getPO(getHT_Career_ID(), get_TrxName());	}

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

	public ve.net.dcs.model.I_HT_DegreeOfApproval getHT_DegreeOfApproval() throws RuntimeException
    {
		return (ve.net.dcs.model.I_HT_DegreeOfApproval)MTable.get(getCtx(), ve.net.dcs.model.I_HT_DegreeOfApproval.Table_Name)
			.getPO(getHT_DegreeOfApproval_ID(), get_TrxName());	}

	/** Set Degree Of Approval.
		@param HT_DegreeOfApproval_ID Degree Of Approval	  */
	public void setHT_DegreeOfApproval_ID (int HT_DegreeOfApproval_ID)
	{
		if (HT_DegreeOfApproval_ID < 1) 
			set_Value (COLUMNNAME_HT_DegreeOfApproval_ID, null);
		else 
			set_Value (COLUMNNAME_HT_DegreeOfApproval_ID, Integer.valueOf(HT_DegreeOfApproval_ID));
	}

	/** Get Degree Of Approval.
		@return Degree Of Approval	  */
	public int getHT_DegreeOfApproval_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HT_DegreeOfApproval_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public ve.net.dcs.model.I_HT_InstituteUniversity getHT_InstituteUniversity() throws RuntimeException
    {
		return (ve.net.dcs.model.I_HT_InstituteUniversity)MTable.get(getCtx(), ve.net.dcs.model.I_HT_InstituteUniversity.Table_Name)
			.getPO(getHT_InstituteUniversity_ID(), get_TrxName());	}

	/** Set Institute/University.
		@param HT_InstituteUniversity_ID Institute/University	  */
	public void setHT_InstituteUniversity_ID (int HT_InstituteUniversity_ID)
	{
		if (HT_InstituteUniversity_ID < 1) 
			set_Value (COLUMNNAME_HT_InstituteUniversity_ID, null);
		else 
			set_Value (COLUMNNAME_HT_InstituteUniversity_ID, Integer.valueOf(HT_InstituteUniversity_ID));
	}

	/** Get Institute/University.
		@return Institute/University	  */
	public int getHT_InstituteUniversity_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HT_InstituteUniversity_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public ve.net.dcs.model.I_HT_TitleObtained getHT_TitleObtained() throws RuntimeException
    {
		return (ve.net.dcs.model.I_HT_TitleObtained)MTable.get(getCtx(), ve.net.dcs.model.I_HT_TitleObtained.Table_Name)
			.getPO(getHT_TitleObtained_ID(), get_TrxName());	}

	/** Set Title Obtained.
		@param HT_TitleObtained_ID Title Obtained	  */
	public void setHT_TitleObtained_ID (int HT_TitleObtained_ID)
	{
		if (HT_TitleObtained_ID < 1) 
			set_Value (COLUMNNAME_HT_TitleObtained_ID, null);
		else 
			set_Value (COLUMNNAME_HT_TitleObtained_ID, Integer.valueOf(HT_TitleObtained_ID));
	}

	/** Get Title Obtained.
		@return Title Obtained	  */
	public int getHT_TitleObtained_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HT_TitleObtained_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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