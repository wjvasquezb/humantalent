package ve.net.dcs.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MHTCareer extends X_HT_Career {

	private static final long serialVersionUID = 2152971478522528921L;

	public MHTCareer(Properties ctx, int HT_Career_ID, String trxName) {
		super(ctx, HT_Career_ID, trxName);
	}

	public MHTCareer(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

}
