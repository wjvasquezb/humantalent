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

/** Generated Model for HT_MedicalTestEmployee
 *  @author iDempiere (generated) 
 *  @version Release 1.0b - $Id$ */
public class X_HT_MedicalTestEmployee extends PO implements I_HT_MedicalTestEmployee, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20130709L;

    /** Standard Constructor */
    public X_HT_MedicalTestEmployee (Properties ctx, int HT_MedicalTestEmployee_ID, String trxName)
    {
      super (ctx, HT_MedicalTestEmployee_ID, trxName);
      /** if (HT_MedicalTestEmployee_ID == 0)
        {
			setC_BPartner_ID (0);
			setDate1 (new Timestamp( System.currentTimeMillis() ));
			setHT_GroupMedicalTest_ID (0);
// @#AD_Org_ID@
			setHT_MedicalTestEmployee_ID (0);
			setHT_TypeMedicalTest_ID (0);
        } */
    }

    /** Load Constructor */
    public X_HT_MedicalTestEmployee (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HT_MedicalTestEmployee[")
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

	public ve.net.dcs.model.I_HT_GroupMedicalTest getHT_GroupMedicalTest() throws RuntimeException
    {
		return (ve.net.dcs.model.I_HT_GroupMedicalTest)MTable.get(getCtx(), ve.net.dcs.model.I_HT_GroupMedicalTest.Table_Name)
			.getPO(getHT_GroupMedicalTest_ID(), get_TrxName());	}

	/** Set  Group Medical Test.
		@param HT_GroupMedicalTest_ID  Group Medical Test	  */
	public void setHT_GroupMedicalTest_ID (int HT_GroupMedicalTest_ID)
	{
		if (HT_GroupMedicalTest_ID < 1) 
			set_Value (COLUMNNAME_HT_GroupMedicalTest_ID, null);
		else 
			set_Value (COLUMNNAME_HT_GroupMedicalTest_ID, Integer.valueOf(HT_GroupMedicalTest_ID));
	}

	/** Get  Group Medical Test.
		@return  Group Medical Test	  */
	public int getHT_GroupMedicalTest_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HT_GroupMedicalTest_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Medical Test Employee.
		@param HT_MedicalTestEmployee_ID Medical Test Employee	  */
	public void setHT_MedicalTestEmployee_ID (int HT_MedicalTestEmployee_ID)
	{
		if (HT_MedicalTestEmployee_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HT_MedicalTestEmployee_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HT_MedicalTestEmployee_ID, Integer.valueOf(HT_MedicalTestEmployee_ID));
	}

	/** Get Medical Test Employee.
		@return Medical Test Employee	  */
	public int getHT_MedicalTestEmployee_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HT_MedicalTestEmployee_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HT_MedicalTestEmployee_UU.
		@param HT_MedicalTestEmployee_UU HT_MedicalTestEmployee_UU	  */
	public void setHT_MedicalTestEmployee_UU (String HT_MedicalTestEmployee_UU)
	{
		set_Value (COLUMNNAME_HT_MedicalTestEmployee_UU, HT_MedicalTestEmployee_UU);
	}

	/** Get HT_MedicalTestEmployee_UU.
		@return HT_MedicalTestEmployee_UU	  */
	public String getHT_MedicalTestEmployee_UU () 
	{
		return (String)get_Value(COLUMNNAME_HT_MedicalTestEmployee_UU);
	}

	public ve.net.dcs.model.I_HT_TypeMedicalTest getHT_TypeMedicalTest() throws RuntimeException
    {
		return (ve.net.dcs.model.I_HT_TypeMedicalTest)MTable.get(getCtx(), ve.net.dcs.model.I_HT_TypeMedicalTest.Table_Name)
			.getPO(getHT_TypeMedicalTest_ID(), get_TrxName());	}

	/** Set Type Medical Test.
		@param HT_TypeMedicalTest_ID Type Medical Test	  */
	public void setHT_TypeMedicalTest_ID (int HT_TypeMedicalTest_ID)
	{
		if (HT_TypeMedicalTest_ID < 1) 
			set_Value (COLUMNNAME_HT_TypeMedicalTest_ID, null);
		else 
			set_Value (COLUMNNAME_HT_TypeMedicalTest_ID, Integer.valueOf(HT_TypeMedicalTest_ID));
	}

	/** Get Type Medical Test.
		@return Type Medical Test	  */
	public int getHT_TypeMedicalTest_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HT_TypeMedicalTest_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Indications.
		@param Indications Indications	  */
	public void setIndications (String Indications)
	{
		set_Value (COLUMNNAME_Indications, Indications);
	}

	/** Get Indications.
		@return Indications	  */
	public String getIndications () 
	{
		return (String)get_Value(COLUMNNAME_Indications);
	}
}