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

/** Generated Interface for HT_EvaluationEmployee
 *  @author iDempiere (generated) 
 *  @version Release 1.0b
 */
@SuppressWarnings("all")
public interface I_HT_EvaluationEmployee 
{

    /** TableName=HT_EvaluationEmployee */
    public static final String Table_Name = "HT_EvaluationEmployee";

    /** AD_Table_ID=1000019 */
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

    /** Column name Comments */
    public static final String COLUMNNAME_Comments = "Comments";

	/** Set Comments.
	  * Comments or additional information
	  */
	public void setComments (String Comments);

	/** Get Comments.
	  * Comments or additional information
	  */
	public String getComments();

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

    /** Column name Date1 */
    public static final String COLUMNNAME_Date1 = "Date1";

	/** Set Date.
	  * Date when business is not conducted
	  */
	public void setDate1 (Timestamp Date1);

	/** Get Date.
	  * Date when business is not conducted
	  */
	public Timestamp getDate1();

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

    /** Column name HR_Job_ID */
    public static final String COLUMNNAME_HR_Job_ID = "HR_Job_ID";

	/** Set Payroll Job	  */
	public void setHR_Job_ID (int HR_Job_ID);

	/** Get Payroll Job	  */
	public int getHR_Job_ID();

	public org.eevolution.model.I_HR_Job getHR_Job() throws RuntimeException;

    /** Column name HT_EvaluationEmployee_ID */
    public static final String COLUMNNAME_HT_EvaluationEmployee_ID = "HT_EvaluationEmployee_ID";

	/** Set Evaluation Employee	  */
	public void setHT_EvaluationEmployee_ID (int HT_EvaluationEmployee_ID);

	/** Get Evaluation Employee	  */
	public int getHT_EvaluationEmployee_ID();

    /** Column name HT_EvaluationEmployee_UU */
    public static final String COLUMNNAME_HT_EvaluationEmployee_UU = "HT_EvaluationEmployee_UU";

	/** Set HT_EvaluationEmployee_UU	  */
	public void setHT_EvaluationEmployee_UU (String HT_EvaluationEmployee_UU);

	/** Get HT_EvaluationEmployee_UU	  */
	public String getHT_EvaluationEmployee_UU();

    /** Column name HT_Evaluation_ID */
    public static final String COLUMNNAME_HT_Evaluation_ID = "HT_Evaluation_ID";

	/** Set Evaluation	  */
	public void setHT_Evaluation_ID (int HT_Evaluation_ID);

	/** Get Evaluation	  */
	public int getHT_Evaluation_ID();

	public ve.net.dcs.model.I_HT_Evaluation getHT_Evaluation() throws RuntimeException;

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

    /** Column name Objective */
    public static final String COLUMNNAME_Objective = "Objective";

	/** Set Objective.
	  * Objective
	  */
	public void setObjective (String Objective);

	/** Get Objective.
	  * Objective
	  */
	public String getObjective();

    /** Column name Percentage */
    public static final String COLUMNNAME_Percentage = "Percentage";

	/** Set Percentage.
	  * Percent of the entire amount
	  */
	public void setPercentage (BigDecimal Percentage);

	/** Get Percentage.
	  * Percent of the entire amount
	  */
	public BigDecimal getPercentage();

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

    /** Column name Strengths */
    public static final String COLUMNNAME_Strengths = "Strengths";

	/** Set Strengths.
	  * Strengths
	  */
	public void setStrengths (String Strengths);

	/** Get Strengths.
	  * Strengths
	  */
	public String getStrengths();

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

    /** Column name Weaknesses */
    public static final String COLUMNNAME_Weaknesses = "Weaknesses";

	/** Set Weaknesses.
	  * Weaknesses
	  */
	public void setWeaknesses (String Weaknesses);

	/** Get Weaknesses.
	  * Weaknesses
	  */
	public String getWeaknesses();
}
