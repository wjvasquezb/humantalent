package ve.net.dcs.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MHTInstituteUniversity extends X_HT_InstituteUniversity {

	private static final long serialVersionUID = 8330624635662608676L;

	public MHTInstituteUniversity(Properties ctx, int HT_InstituteUniversity_ID, String trxName) {
		super(ctx, HT_InstituteUniversity_ID, trxName);
	}

	public MHTInstituteUniversity(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

}
