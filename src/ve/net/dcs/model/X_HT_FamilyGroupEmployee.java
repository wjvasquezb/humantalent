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
import org.compiere.util.KeyNamePair;

/** Generated Model for HT_FamilyGroupEmployee
 *  @author iDempiere (generated) 
 *  @version Release 1.0b - $Id$ */
public class X_HT_FamilyGroupEmployee extends PO implements I_HT_FamilyGroupEmployee, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20130709L;

    /** Standard Constructor */
    public X_HT_FamilyGroupEmployee (Properties ctx, int HT_FamilyGroupEmployee_ID, String trxName)
    {
      super (ctx, HT_FamilyGroupEmployee_ID, trxName);
      /** if (HT_FamilyGroupEmployee_ID == 0)
        {
			setBirthday (new Timestamp( System.currentTimeMillis() ));
			setC_BPartner_ID (0);
			setGender (null);
			setHT_FamilyGroupEmployee_ID (0);
			setHT_Relationship_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_HT_FamilyGroupEmployee (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HT_FamilyGroupEmployee[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Birthday.
		@param Birthday 
		Birthday or Anniversary day
	  */
	public void setBirthday (Timestamp Birthday)
	{
		set_Value (COLUMNNAME_Birthday, Birthday);
	}

	/** Get Birthday.
		@return Birthday or Anniversary day
	  */
	public Timestamp getBirthday () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Birthday);
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

	/** Gender AD_Reference_ID=1000007 */
	public static final int GENDER_AD_Reference_ID=1000007;
	/** Female = F */
	public static final String GENDER_Female = "F";
	/** Male = M */
	public static final String GENDER_Male = "M";
	/** Set Gender.
		@param Gender Gender	  */
	public void setGender (String Gender)
	{

		set_Value (COLUMNNAME_Gender, Gender);
	}

	/** Get Gender.
		@return Gender	  */
	public String getGender () 
	{
		return (String)get_Value(COLUMNNAME_Gender);
	}

	/** Set Family Group Employee .
		@param HT_FamilyGroupEmployee_ID Family Group Employee 	  */
	public void setHT_FamilyGroupEmployee_ID (int HT_FamilyGroupEmployee_ID)
	{
		if (HT_FamilyGroupEmployee_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HT_FamilyGroupEmployee_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HT_FamilyGroupEmployee_ID, Integer.valueOf(HT_FamilyGroupEmployee_ID));
	}

	/** Get Family Group Employee .
		@return Family Group Employee 	  */
	public int getHT_FamilyGroupEmployee_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HT_FamilyGroupEmployee_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HT_FamilyGroupEmployee_UU.
		@param HT_FamilyGroupEmployee_UU HT_FamilyGroupEmployee_UU	  */
	public void setHT_FamilyGroupEmployee_UU (String HT_FamilyGroupEmployee_UU)
	{
		set_Value (COLUMNNAME_HT_FamilyGroupEmployee_UU, HT_FamilyGroupEmployee_UU);
	}

	/** Get HT_FamilyGroupEmployee_UU.
		@return HT_FamilyGroupEmployee_UU	  */
	public String getHT_FamilyGroupEmployee_UU () 
	{
		return (String)get_Value(COLUMNNAME_HT_FamilyGroupEmployee_UU);
	}

	public ve.net.dcs.model.I_HT_Relationship getHT_Relationship() throws RuntimeException
    {
		return (ve.net.dcs.model.I_HT_Relationship)MTable.get(getCtx(), ve.net.dcs.model.I_HT_Relationship.Table_Name)
			.getPO(getHT_Relationship_ID(), get_TrxName());	}

	/** Set Relationship.
		@param HT_Relationship_ID Relationship	  */
	public void setHT_Relationship_ID (int HT_Relationship_ID)
	{
		if (HT_Relationship_ID < 1) 
			set_Value (COLUMNNAME_HT_Relationship_ID, null);
		else 
			set_Value (COLUMNNAME_HT_Relationship_ID, Integer.valueOf(HT_Relationship_ID));
	}

	/** Get Relationship.
		@return Relationship	  */
	public int getHT_Relationship_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HT_Relationship_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Childcare.
		@param IsChildcare 
		Childcare
	  */
	public void setIsChildcare (boolean IsChildcare)
	{
		set_Value (COLUMNNAME_IsChildcare, Boolean.valueOf(IsChildcare));
	}

	/** Get Childcare.
		@return Childcare
	  */
	public boolean isChildcare () 
	{
		Object oo = get_Value(COLUMNNAME_IsChildcare);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Legal Representative.
		@param isLegalRepresentative Legal Representative	  */
	public void setisLegalRepresentative (boolean isLegalRepresentative)
	{
		set_Value (COLUMNNAME_isLegalRepresentative, Boolean.valueOf(isLegalRepresentative));
	}

	/** Get Legal Representative.
		@return Legal Representative	  */
	public boolean isLegalRepresentative () 
	{
		Object oo = get_Value(COLUMNNAME_isLegalRepresentative);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getName());
    }

	/** Set Tax ID.
		@param TaxID 
		Tax Identification
	  */
	public void setTaxID (String TaxID)
	{
		set_Value (COLUMNNAME_TaxID, TaxID);
	}

	/** Get Tax ID.
		@return Tax Identification
	  */
	public String getTaxID () 
	{
		return (String)get_Value(COLUMNNAME_TaxID);
	}

	/** Set Weight.
		@param Weight 
		Weight of a product
	  */
	public void setWeight (BigDecimal Weight)
	{
		set_Value (COLUMNNAME_Weight, Weight);
	}

	/** Get Weight.
		@return Weight of a product
	  */
	public BigDecimal getWeight () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Weight);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}