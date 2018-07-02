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

/** Generated Model for HT_MedicalConsultEmployee
 *  @author iDempiere (generated) 
 *  @version Release 1.0b - $Id$ */
public class X_HT_MedicalConsultEmployee extends PO implements I_HT_MedicalConsultEmployee, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20130709L;

    /** Standard Constructor */
    public X_HT_MedicalConsultEmployee (Properties ctx, int HT_MedicalConsultEmployee_ID, String trxName)
    {
      super (ctx, HT_MedicalConsultEmployee_ID, trxName);
      /** if (HT_MedicalConsultEmployee_ID == 0)
        {
			setC_BPartner_ID (0);
			setDate1 (new Timestamp( System.currentTimeMillis() ));
			setHT_MedicalConsultEmployee_ID (0);
        } */
    }

    /** Load Constructor */
    public X_HT_MedicalConsultEmployee (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HT_MedicalConsultEmployee[")
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

	/** Set Medical Consult Employee.
		@param HT_MedicalConsultEmployee_ID Medical Consult Employee	  */
	public void setHT_MedicalConsultEmployee_ID (int HT_MedicalConsultEmployee_ID)
	{
		if (HT_MedicalConsultEmployee_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HT_MedicalConsultEmployee_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HT_MedicalConsultEmployee_ID, Integer.valueOf(HT_MedicalConsultEmployee_ID));
	}

	/** Get Medical Consult Employee.
		@return Medical Consult Employee	  */
	public int getHT_MedicalConsultEmployee_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HT_MedicalConsultEmployee_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HT_MedicalConsultEmployee_UU.
		@param HT_MedicalConsultEmployee_UU HT_MedicalConsultEmployee_UU	  */
	public void setHT_MedicalConsultEmployee_UU (String HT_MedicalConsultEmployee_UU)
	{
		set_Value (COLUMNNAME_HT_MedicalConsultEmployee_UU, HT_MedicalConsultEmployee_UU);
	}

	/** Get HT_MedicalConsultEmployee_UU.
		@return HT_MedicalConsultEmployee_UU	  */
	public String getHT_MedicalConsultEmployee_UU () 
	{
		return (String)get_Value(COLUMNNAME_HT_MedicalConsultEmployee_UU);
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