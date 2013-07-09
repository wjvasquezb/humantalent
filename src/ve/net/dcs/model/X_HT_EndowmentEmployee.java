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

/** Generated Model for HT_EndowmentEmployee
 *  @author iDempiere (generated) 
 *  @version Release 1.0b - $Id$ */
public class X_HT_EndowmentEmployee extends PO implements I_HT_EndowmentEmployee, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20130709L;

    /** Standard Constructor */
    public X_HT_EndowmentEmployee (Properties ctx, int HT_EndowmentEmployee_ID, String trxName)
    {
      super (ctx, HT_EndowmentEmployee_ID, trxName);
      /** if (HT_EndowmentEmployee_ID == 0)
        {
			setC_BPartner_ID (0);
			setDateDelivered (new Timestamp( System.currentTimeMillis() ));
			setHT_ArticleOfEndowment_ID (0);
			setHT_EndowmentEmployee_ID (0);
			setQty (0);
        } */
    }

    /** Load Constructor */
    public X_HT_EndowmentEmployee (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HT_EndowmentEmployee[")
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

	/** Set Date Delivered.
		@param DateDelivered 
		Date when the product was delivered
	  */
	public void setDateDelivered (Timestamp DateDelivered)
	{
		set_Value (COLUMNNAME_DateDelivered, DateDelivered);
	}

	/** Get Date Delivered.
		@return Date when the product was delivered
	  */
	public Timestamp getDateDelivered () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateDelivered);
	}

	/** Set Expiration Date.
		@param DateExpiration 
		Date of Expiration
	  */
	public void setDateExpiration (Timestamp DateExpiration)
	{
		set_Value (COLUMNNAME_DateExpiration, DateExpiration);
	}

	/** Get Expiration Date.
		@return Date of Expiration
	  */
	public Timestamp getDateExpiration () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateExpiration);
	}

	public ve.net.dcs.model.I_HT_ArticleOfEndowment getHT_ArticleOfEndowment() throws RuntimeException
    {
		return (ve.net.dcs.model.I_HT_ArticleOfEndowment)MTable.get(getCtx(), ve.net.dcs.model.I_HT_ArticleOfEndowment.Table_Name)
			.getPO(getHT_ArticleOfEndowment_ID(), get_TrxName());	}

	/** Set Article of Endowment.
		@param HT_ArticleOfEndowment_ID Article of Endowment	  */
	public void setHT_ArticleOfEndowment_ID (int HT_ArticleOfEndowment_ID)
	{
		if (HT_ArticleOfEndowment_ID < 1) 
			set_Value (COLUMNNAME_HT_ArticleOfEndowment_ID, null);
		else 
			set_Value (COLUMNNAME_HT_ArticleOfEndowment_ID, Integer.valueOf(HT_ArticleOfEndowment_ID));
	}

	/** Get Article of Endowment.
		@return Article of Endowment	  */
	public int getHT_ArticleOfEndowment_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HT_ArticleOfEndowment_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Endowment Employee.
		@param HT_EndowmentEmployee_ID Endowment Employee	  */
	public void setHT_EndowmentEmployee_ID (int HT_EndowmentEmployee_ID)
	{
		if (HT_EndowmentEmployee_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HT_EndowmentEmployee_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HT_EndowmentEmployee_ID, Integer.valueOf(HT_EndowmentEmployee_ID));
	}

	/** Get Endowment Employee.
		@return Endowment Employee	  */
	public int getHT_EndowmentEmployee_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HT_EndowmentEmployee_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HT_EndowmentEmployee_UU.
		@param HT_EndowmentEmployee_UU HT_EndowmentEmployee_UU	  */
	public void setHT_EndowmentEmployee_UU (String HT_EndowmentEmployee_UU)
	{
		set_Value (COLUMNNAME_HT_EndowmentEmployee_UU, HT_EndowmentEmployee_UU);
	}

	/** Get HT_EndowmentEmployee_UU.
		@return HT_EndowmentEmployee_UU	  */
	public String getHT_EndowmentEmployee_UU () 
	{
		return (String)get_Value(COLUMNNAME_HT_EndowmentEmployee_UU);
	}

	/** Set Quantity.
		@param Qty 
		Quantity
	  */
	public void setQty (int Qty)
	{
		set_Value (COLUMNNAME_Qty, Integer.valueOf(Qty));
	}

	/** Get Quantity.
		@return Quantity
	  */
	public int getQty () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Qty);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}