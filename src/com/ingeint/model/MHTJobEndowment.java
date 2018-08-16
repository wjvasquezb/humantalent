package com.ingeint.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.Query;

import java.util.List;

public class MHTJobEndowment extends X_HT_JobEndowment {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3432026029113160771L;

	public MHTJobEndowment(Properties ctx, int HT_JobEndowment_ID, String trxName) {
		super(ctx, HT_JobEndowment_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MHTJobEndowment(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	
	public static MHTJobEndowment[] getJobEndowment(Properties ctx, Integer HR_Job_ID, String trxname) {
		
		List<MHTJobEndowment> list = new Query(ctx, MHTJobEndowment.Table_Name, " HR_Job_ID = ? ", trxname)
				.setParameters(HR_Job_ID)
				.list(); 
		
		return list.toArray(new MHTJobEndowment[list.size()]);
	}
}
