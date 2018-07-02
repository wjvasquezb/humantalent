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
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Model for HT_TypeMedicalTest
 *  @author iDempiere (generated) 
 *  @version Release 1.0b - $Id$ */
public class X_HT_TypeMedicalTest extends PO implements I_HT_TypeMedicalTest, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20130709L;

    /** Standard Constructor */
    public X_HT_TypeMedicalTest (Properties ctx, int HT_TypeMedicalTest_ID, String trxName)
    {
      super (ctx, HT_TypeMedicalTest_ID, trxName);
      /** if (HT_TypeMedicalTest_ID == 0)
        {
			setHT_TypeMedicalTest_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_HT_TypeMedicalTest (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HT_TypeMedicalTest[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Type Medical Test.
		@param HT_TypeMedicalTest_ID Type Medical Test	  */
	public void setHT_TypeMedicalTest_ID (int HT_TypeMedicalTest_ID)
	{
		if (HT_TypeMedicalTest_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HT_TypeMedicalTest_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HT_TypeMedicalTest_ID, Integer.valueOf(HT_TypeMedicalTest_ID));
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

	/** Set HT_TypeMedicalTest_UU.
		@param HT_TypeMedicalTest_UU HT_TypeMedicalTest_UU	  */
	public void setHT_TypeMedicalTest_UU (String HT_TypeMedicalTest_UU)
	{
		set_Value (COLUMNNAME_HT_TypeMedicalTest_UU, HT_TypeMedicalTest_UU);
	}

	/** Get HT_TypeMedicalTest_UU.
		@return HT_TypeMedicalTest_UU	  */
	public String getHT_TypeMedicalTest_UU () 
	{
		return (String)get_Value(COLUMNNAME_HT_TypeMedicalTest_UU);
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
}