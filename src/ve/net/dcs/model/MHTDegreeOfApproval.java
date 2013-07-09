package ve.net.dcs.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MHTDegreeOfApproval extends X_HT_DegreeOfApproval {

	private static final long serialVersionUID = 7341546408487828969L;

	public MHTDegreeOfApproval(Properties ctx, int HT_DegreeOfApproval_ID, String trxName) {
		super(ctx, HT_DegreeOfApproval_ID, trxName);
	}

	public MHTDegreeOfApproval(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

}
