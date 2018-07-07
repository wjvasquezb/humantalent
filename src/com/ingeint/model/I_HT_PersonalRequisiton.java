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
package com.ingeint.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for HT_PersonalRequisiton
 *  @author iDempiere (generated) 
 *  @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_HT_PersonalRequisiton 
{

    /** TableName=HT_PersonalRequisiton */
    public static final String Table_Name = "HT_PersonalRequisiton";

    /** AD_Table_ID=1000042 */
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

    /** Column name AD_User_ID */
    public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

	/** Set User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID);

	/** Get User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID();

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException;

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

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name EstimatedSalary */
    public static final String COLUMNNAME_EstimatedSalary = "EstimatedSalary";

	/** Set EstimatedSalary	  */
	public void setEstimatedSalary (BigDecimal EstimatedSalary);

	/** Get EstimatedSalary	  */
	public BigDecimal getEstimatedSalary();

    /** Column name HR_Department_ID */
    public static final String COLUMNNAME_HR_Department_ID = "HR_Department_ID";

	/** Set Payroll Department	  */
	public void setHR_Department_ID (int HR_Department_ID);

	/** Get Payroll Department	  */
	public int getHR_Department_ID();

	public org.eevolution.model.I_HR_Department getHR_Department() throws RuntimeException;

    /** Column name HR_Job_ID */
    public static final String COLUMNNAME_HR_Job_ID = "HR_Job_ID";

	/** Set Payroll Job	  */
	public void setHR_Job_ID (int HR_Job_ID);

	/** Get Payroll Job	  */
	public int getHR_Job_ID();

	public org.eevolution.model.I_HR_Job getHR_Job() throws RuntimeException;

    /** Column name HTLoadProspect */
    public static final String COLUMNNAME_HTLoadProspect = "HTLoadProspect";

	/** Set HTLoadProspect	  */
	public void setHTLoadProspect (String HTLoadProspect);

	/** Get HTLoadProspect	  */
	public String getHTLoadProspect();

    /** Column name HT_Career2_ID */
    public static final String COLUMNNAME_HT_Career2_ID = "HT_Career2_ID";

	/** Set Career	  */
	public void setHT_Career2_ID (int HT_Career2_ID);

	/** Get Career	  */
	public int getHT_Career2_ID();

    /** Column name HT_Career3_ID */
    public static final String COLUMNNAME_HT_Career3_ID = "HT_Career3_ID";

	/** Set Career 3	  */
	public void setHT_Career3_ID (int HT_Career3_ID);

	/** Get Career 3	  */
	public int getHT_Career3_ID();

    /** Column name HT_Career_ID */
    public static final String COLUMNNAME_HT_Career_ID = "HT_Career_ID";

	/** Set Career	  */
	public void setHT_Career_ID (int HT_Career_ID);

	/** Get Career	  */
	public int getHT_Career_ID();

    /** Column name HT_PersonalRequisiton_ID */
    public static final String COLUMNNAME_HT_PersonalRequisiton_ID = "HT_PersonalRequisiton_ID";

	/** Set HT_PersonalRequisiton	  */
	public void setHT_PersonalRequisiton_ID (int HT_PersonalRequisiton_ID);

	/** Get HT_PersonalRequisiton	  */
	public int getHT_PersonalRequisiton_ID();

    /** Column name HT_PersonalRequisiton_UU */
    public static final String COLUMNNAME_HT_PersonalRequisiton_UU = "HT_PersonalRequisiton_UU";

	/** Set HT_PersonalRequisiton_UU	  */
	public void setHT_PersonalRequisiton_UU (String HT_PersonalRequisiton_UU);

	/** Get HT_PersonalRequisiton_UU	  */
	public String getHT_PersonalRequisiton_UU();

    /** Column name Help */
    public static final String COLUMNNAME_Help = "Help";

	/** Set Comment/Help.
	  * Comment or Hint
	  */
	public void setHelp (String Help);

	/** Get Comment/Help.
	  * Comment or Hint
	  */
	public String getHelp();

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

    /** Column name RequestDate */
    public static final String COLUMNNAME_RequestDate = "RequestDate";

	/** Set Request Date	  */
	public void setRequestDate (Timestamp RequestDate);

	/** Get Request Date	  */
	public Timestamp getRequestDate();

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

    /** Column name VacanciesNumber */
    public static final String COLUMNNAME_VacanciesNumber = "VacanciesNumber";

	/** Set Vacancies Number	  */
	public void setVacanciesNumber (int VacanciesNumber);

	/** Get Vacancies Number	  */
	public int getVacanciesNumber();
}
