package com.ingeint.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MHTPersonalRequisitionLine extends X_HT_PersonalRequisitonLine{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7882629756929597833L;

	public MHTPersonalRequisitionLine(Properties ctx, int HT_PersonalRequisitonLine_ID, String trxName) {
		super(ctx, HT_PersonalRequisitonLine_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MHTPersonalRequisitionLine(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	
	public MHTPersonalRequisitionLine (MHTPersonalRequisition requisition) {
		
		this (requisition.getCtx(), 0, requisition.get_TrxName());
		if(requisition.get_ID()==0)
			throw new IllegalArgumentException("Header not saved");
		setHT_PersonalRequisiton_ID(requisition.get_ID()); //parent
		setRequisition(requisition);			
	}
	
	public void setRequisition (MHTPersonalRequisition requisition) {
		
		setClientOrg(requisition);
	}

	

}
