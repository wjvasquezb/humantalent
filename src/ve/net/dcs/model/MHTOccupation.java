package ve.net.dcs.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MHTOccupation extends X_HT_Occupation {

	private static final long serialVersionUID = 4392423416670928763L;

	public MHTOccupation(Properties ctx, int HT_Occupation_ID, String trxName) {
		super(ctx, HT_Occupation_ID, trxName);
	}

	public MHTOccupation(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

}
