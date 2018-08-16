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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for HT_JobEndowment
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
public class X_HT_JobEndowment extends PO implements I_HT_JobEndowment, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20180813L;

    /** Standard Constructor */
    public X_HT_JobEndowment (Properties ctx, int HT_JobEndowment_ID, String trxName)
    {
      super (ctx, HT_JobEndowment_ID, trxName);
      /** if (HT_JobEndowment_ID == 0)
        {
			setHT_JobEndowment_ID (0);
			setIsEmployee (true);
// Y
        } */
    }

    /** Load Constructor */
    public X_HT_JobEndowment (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HT_JobEndowment[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set Date received.
		@param DateReceived 
		Date a product was received
	  */
	public void setDateReceived (Timestamp DateReceived)
	{
		set_Value (COLUMNNAME_DateReceived, DateReceived);
	}

	/** Get Date received.
		@return Date a product was received
	  */
	public Timestamp getDateReceived () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateReceived);
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

	/** Set Article of Endowment.
		@param HT_ArticleOfEndowment_ID Article of Endowment	  */
	public void setHT_ArticleOfEndowment_ID (int HT_ArticleOfEndowment_ID)
	{
		if (HT_ArticleOfEndowment_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HT_ArticleOfEndowment_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HT_ArticleOfEndowment_ID, Integer.valueOf(HT_ArticleOfEndowment_ID));
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

	/** Set HT_JobEndowment.
		@param HT_JobEndowment_ID HT_JobEndowment	  */
	public void setHT_JobEndowment_ID (int HT_JobEndowment_ID)
	{
		if (HT_JobEndowment_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HT_JobEndowment_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HT_JobEndowment_ID, Integer.valueOf(HT_JobEndowment_ID));
	}

	/** Get HT_JobEndowment.
		@return HT_JobEndowment	  */
	public int getHT_JobEndowment_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HT_JobEndowment_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HT_JobEndowment_UU.
		@param HT_JobEndowment_UU HT_JobEndowment_UU	  */
	public void setHT_JobEndowment_UU (String HT_JobEndowment_UU)
	{
		set_Value (COLUMNNAME_HT_JobEndowment_UU, HT_JobEndowment_UU);
	}

	/** Get HT_JobEndowment_UU.
		@return HT_JobEndowment_UU	  */
	public String getHT_JobEndowment_UU () 
	{
		return (String)get_Value(COLUMNNAME_HT_JobEndowment_UU);
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
}