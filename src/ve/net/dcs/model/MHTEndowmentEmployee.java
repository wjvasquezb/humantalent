package ve.net.dcs.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MHTEndowmentEmployee extends X_HT_EndowmentEmployee {

	private static final long serialVersionUID = 1832301413821658878L;

	public MHTEndowmentEmployee(Properties ctx, int HT_EndowmentEmployee_ID, String trxName) {
		super(ctx, HT_EndowmentEmployee_ID, trxName);
	}

	public MHTEndowmentEmployee(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

}
