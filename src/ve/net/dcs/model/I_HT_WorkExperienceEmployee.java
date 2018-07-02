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
package ve.net.dcs.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for HT_WorkExperienceEmployee
 *  @author iDempiere (generated) 
 *  @version Release 1.0b
 */
@SuppressWarnings("all")
public interface I_HT_WorkExperienceEmployee 
{

    /** TableName=HT_WorkExperienceEmployee */
    public static final String Table_Name = "HT_WorkExperienceEmployee";

    /** AD_Table_ID=1000020 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name Address */
    public static final String COLUMNNAME_Address = "Address";

	/** Set Address	  */
	public void setAddress (String Address);

	/** Get Address	  */
	public String getAddress();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name Boss */
    public static final String COLUMNNAME_Boss = "Boss";

	/** Set Boss.
	  * Boss
	  */
	public void setBoss (String Boss);

	/** Get Boss.
	  * Boss
	  */
	public String getBoss();

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner .
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner .
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

    /** Column name Company */
    public static final String COLUMNNAME_Company = "Company";

	/** Set Company.
	  * Company
	  */
	public void setCompany (String Company);

	/** Get Company.
	  * Company
	  */
	public String getCompany();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name CurrentEmployment */
    public static final String COLUMNNAME_CurrentEmployment = "CurrentEmployment";

	/** Set Current Employment.
	  * Current Employment
	  */
	public void setCurrentEmployment (boolean CurrentEmployment);

	/** Get Current Employment.
	  * Current Employment
	  */
	public boolean isCurrentEmployment();

    /** Column name EndDate */
    public static final String COLUMNNAME_EndDate = "EndDate";

	/** Set End Date.
	  * Last effective date (inclusive)
	  */
	public void setEndDate (Timestamp EndDate);

	/** Get End Date.
	  * Last effective date (inclusive)
	  */
	public Timestamp getEndDate();

    /** Column name Functions */
    public static final String COLUMNNAME_Functions = "Functions";

	/** Set Functions.
	  * Funcions
	  */
	public void setFunctions (String Functions);

	/** Get Functions.
	  * Funcions
	  */
	public String getFunctions();

    /** Column name HT_Occupation_ID */
    public static final String COLUMNNAME_HT_Occupation_ID = "HT_Occupation_ID";

	/** Set Occupation	  */
	public void setHT_Occupation_ID (int HT_Occupation_ID);

	/** Get Occupation	  */
	public int getHT_Occupation_ID();

	public ve.net.dcs.model.I_HT_Occupation getHT_Occupation() throws RuntimeException;

    /** Column name HT_WorkExperienceEmployee_ID */
    public static final String COLUMNNAME_HT_WorkExperienceEmployee_ID = "HT_WorkExperienceEmployee_ID";

	/** Set Work Experience Employee	  */
	public void setHT_WorkExperienceEmployee_ID (int HT_WorkExperienceEmployee_ID);

	/** Get Work Experience Employee	  */
	public int getHT_WorkExperienceEmployee_ID();

    /** Column name HT_WorkExperienceEmployee_UU */
    public static final String COLUMNNAME_HT_WorkExperienceEmployee_UU = "HT_WorkExperienceEmployee_UU";

	/** Set HT_WorkExperienceEmployee_UU	  */
	public void setHT_WorkExperienceEmployee_UU (String HT_WorkExperienceEmployee_UU);

	/** Get HT_WorkExperienceEmployee_UU	  */
	public String getHT_WorkExperienceEmployee_UU();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name MotiveOfExit */
    public static final String COLUMNNAME_MotiveOfExit = "MotiveOfExit";

	/** Set Motive Of Exit.
	  * Motive Of Exit
	  */
	public void setMotiveOfExit (String MotiveOfExit);

	/** Get Motive Of Exit.
	  * Motive Of Exit
	  */
	public String getMotiveOfExit();

    /** Column name Phone */
    public static final String COLUMNNAME_Phone = "Phone";

	/** Set Phone.
	  * Identifies a telephone number
	  */
	public void setPhone (String Phone);

	/** Get Phone.
	  * Identifies a telephone number
	  */
	public String getPhone();

    /** Column name Salary */
    public static final String COLUMNNAME_Salary = "Salary";

	/** Set Salary.
	  * Sueldo
	  */
	public void setSalary (BigDecimal Salary);

	/** Get Salary.
	  * Sueldo
	  */
	public BigDecimal getSalary();

    /** Column name StartDate */
    public static final String COLUMNNAME_StartDate = "StartDate";

	/** Set Start Date.
	  * First effective day (inclusive)
	  */
	public void setStartDate (Timestamp StartDate);

	/** Get Start Date.
	  * First effective day (inclusive)
	  */
	public Timestamp getStartDate();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();
}
