package com.ingeint.utils;


import java.util.Properties;

import org.adempiere.model.MBroadcastMessage;
import org.adempiere.webui.apps.AEnv;
import org.compiere.model.MRequest;
import org.idempiere.broadcast.BroadcastMsgUtil;

public class Utils {

	/**
	 * 	Send Messages
	 *  @author Orlando Curieles - www.ingeint.com
	 *	@param ctx context
	 *	@param AD_Org_ID id
	 *	@param Message String
	 *	@param AD_User_ID id
	 *	@return boolean
	 */
	public static  boolean SendMessagebyUser(Properties ctx, Integer AD_Org_ID, String Msg, Integer AD_User_ID ) {

		MBroadcastMessage message = new MBroadcastMessage(ctx, 0, null);

		message.setTarget("U");
		message.setBroadcastMessage(Msg);
		message.setBroadcastFrequency("A");
		message.setAD_User_ID(AD_User_ID);			
		message.saveEx();

		BroadcastMsgUtil.publishBroadcastMessage(message.get_ID(), null);

		return true;
	}

	public static boolean SendMessagebyRole(Properties ctx, Integer AD_Org_ID, String Msg, Integer AD_Role_ID ) {

		MBroadcastMessage message = new MBroadcastMessage(ctx, 0, null);

		message.setTarget("U");
		message.setBroadcastMessage(Msg);
		message.setBroadcastFrequency("A");
		message.setAD_Role_ID(AD_Role_ID);
		message.saveEx();

		BroadcastMsgUtil.publishBroadcastMessage(message.get_ID(), null);

		return true;
	}

	/**
	 *  @author Orlando Curieles - www.ingeint.com
	 *	@param ctx context
	 * @param ctx
	 * @param AD_Org_ID
	 * @param AD_Table_ID
	 * @param Record_ID
	 * @param RequestType_ID
	 * @param content
	 * @param SalesRepID
	 * @param C_BPartner_ID
	 * @param isLoanRequest
	 * @param trxname
	 * @return
	 */
	public static String createRequest(Properties ctx, Integer AD_Org_ID, Integer AD_Table_ID, Integer Record_ID, Integer RequestType_ID, String content, Integer SalesRepID, Integer C_BPartner_ID, Boolean isLoanRequest, String trxname) {
		
		MRequest request = new MRequest(ctx, 0, trxname);
		request.setAD_Org_ID(AD_Org_ID);
		request.setAD_Table_ID(AD_Table_ID);
		request.setRecord_ID(Record_ID);
		request.setR_RequestType_ID(RequestType_ID);
		request.setSummary(content);
		request.setSalesRep_ID(SalesRepID);
		request.setC_BPartner_ID(C_BPartner_ID);
		request.set_ValueOfColumn("IsLoanRequest", isLoanRequest);
		request.saveEx();
				
		return request.getDocumentNo().toString();
		
	}
}
