package com.ingeint.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MHTPersonalRequisition extends X_HT_PersonalRequisiton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5085713154229318620L;

	public MHTPersonalRequisition(Properties ctx, int HT_PersonalRequisiton_ID, String trxName) {
		super(ctx, HT_PersonalRequisiton_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	
	public MHTPersonalRequisition(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
}
