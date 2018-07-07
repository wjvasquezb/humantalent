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

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for HT_PersonalRequisitonLine
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
public class X_HT_PersonalRequisitonLine extends PO implements I_HT_PersonalRequisitonLine, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20180706L;

    /** Standard Constructor */
    public X_HT_PersonalRequisitonLine (Properties ctx, int HT_PersonalRequisitonLine_ID, String trxName)
    {
      super (ctx, HT_PersonalRequisitonLine_ID, trxName);
      /** if (HT_PersonalRequisitonLine_ID == 0)
        {
			setHT_PersonalRequisitonLine_ID (0);
        } */
    }

    /** Load Constructor */
    public X_HT_PersonalRequisitonLine (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HT_PersonalRequisitonLine[")
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
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
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

	/** Set HT_PersonalRequisitonLine.
		@param HT_PersonalRequisitonLine_ID HT_PersonalRequisitonLine	  */
	public void setHT_PersonalRequisitonLine_ID (int HT_PersonalRequisitonLine_ID)
	{
		if (HT_PersonalRequisitonLine_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HT_PersonalRequisitonLine_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HT_PersonalRequisitonLine_ID, Integer.valueOf(HT_PersonalRequisitonLine_ID));
	}

	/** Get HT_PersonalRequisitonLine.
		@return HT_PersonalRequisitonLine	  */
	public int getHT_PersonalRequisitonLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HT_PersonalRequisitonLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HT_PersonalRequisitonLine_UU.
		@param HT_PersonalRequisitonLine_UU HT_PersonalRequisitonLine_UU	  */
	public void setHT_PersonalRequisitonLine_UU (String HT_PersonalRequisitonLine_UU)
	{
		set_Value (COLUMNNAME_HT_PersonalRequisitonLine_UU, HT_PersonalRequisitonLine_UU);
	}

	/** Get HT_PersonalRequisitonLine_UU.
		@return HT_PersonalRequisitonLine_UU	  */
	public String getHT_PersonalRequisitonLine_UU () 
	{
		return (String)get_Value(COLUMNNAME_HT_PersonalRequisitonLine_UU);
	}

	public I_HT_PersonalRequisiton getHT_PersonalRequisiton() throws RuntimeException
    {
		return (I_HT_PersonalRequisiton)MTable.get(getCtx(), I_HT_PersonalRequisiton.Table_Name)
			.getPO(getHT_PersonalRequisiton_ID(), get_TrxName());	}

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

	/** Set Employee.
		@param IsEmployee 
		Indicates if  this Business Partner is an employee
	  */
	public void setIsEmployee (boolean IsEmployee)
	{
		set_Value (COLUMNNAME_IsEmployee, Boolean.valueOf(IsEmployee));
	}

	/** Get Employee.
		@return Indicates if  this Business Partner is an employee
	  */
	public boolean isEmployee () 
	{
		Object oo = get_Value(COLUMNNAME_IsEmployee);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set IsHRProspect.
		@param IsHRProspect IsHRProspect	  */
	public void setIsHRProspect (boolean IsHRProspect)
	{
		set_Value (COLUMNNAME_IsHRProspect, Boolean.valueOf(IsHRProspect));
	}

	/** Get IsHRProspect.
		@return IsHRProspect	  */
	public boolean isHRProspect () 
	{
		Object oo = get_Value(COLUMNNAME_IsHRProspect);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Line No.
		@param Line 
		Unique line for this document
	  */
	public void setLine (int Line)
	{
		set_ValueNoCheck (COLUMNNAME_Line, Integer.valueOf(Line));
	}

	/** Get Line No.
		@return Unique line for this document
	  */
	public int getLine () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Line);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}