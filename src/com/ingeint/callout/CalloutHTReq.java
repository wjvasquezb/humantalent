package com.ingeint.callout;

import org.compiere.model.MBPartner;

import com.ingeint.base.CustomCallout;
import com.ingeint.model.MHTPersonalRequisitionLine;

public class CalloutHTReq extends CustomCallout{
	
	
	@Override
	protected String start() {
		Integer C_BPartner_ID = (Integer) getTab().getValue(MHTPersonalRequisitionLine.COLUMNNAME_C_BPartner_ID);
		if (C_BPartner_ID == null)
			return null;
		
		MBPartner partner = new MBPartner(getCtx(), C_BPartner_ID, null);
		
		getTab().setValue(MHTPersonalRequisitionLine.COLUMNNAME_IsEmployee, partner.isEmployee());
		getTab().setValue(MHTPersonalRequisitionLine.COLUMNNAME_IsHRProspect, partner.get_Value("IsHRProspect"));
		return null;
	}
}
