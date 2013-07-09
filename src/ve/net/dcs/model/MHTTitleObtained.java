package ve.net.dcs.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MHTTitleObtained extends X_HT_TitleObtained {

	private static final long serialVersionUID = 6279617956576880720L;

	public MHTTitleObtained(Properties ctx, int HT_TitleObtained_ID, String trxName) {
		super(ctx, HT_TitleObtained_ID, trxName);
	}

	public MHTTitleObtained(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

}
