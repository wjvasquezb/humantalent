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

/** Generated Model for HT_Relationship
 *  @author iDempiere (generated) 
 *  @version Release 1.0b - $Id$ */
public class X_HT_Relationship extends PO implements I_HT_Relationship, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20130709L;

    /** Standard Constructor */
    public X_HT_Relationship (Properties ctx, int HT_Relationship_ID, String trxName)
    {
      super (ctx, HT_Relationship_ID, trxName);
      /** if (HT_Relationship_ID == 0)
        {
			setHT_Relationship_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_HT_Relationship (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HT_Relationship[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set Relationship.
		@param HT_Relationship_ID Relationship	  */
	public void setHT_Relationship_ID (int HT_Relationship_ID)
	{
		if (HT_Relationship_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HT_Relationship_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HT_Relationship_ID, Integer.valueOf(HT_Relationship_ID));
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

	/** Set HT_Relationship_UU.
		@param HT_Relationship_UU HT_Relationship_UU	  */
	public void setHT_Relationship_UU (String HT_Relationship_UU)
	{
		set_Value (COLUMNNAME_HT_Relationship_UU, HT_Relationship_UU);
	}

	/** Get HT_Relationship_UU.
		@return HT_Relationship_UU	  */
	public String getHT_Relationship_UU () 
	{
		return (String)get_Value(COLUMNNAME_HT_Relationship_UU);
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
}