package ve.net.dcs.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MHTFamilyGroupEmployee extends X_HT_FamilyGroupEmployee {

	private static final long serialVersionUID = 5097138970075557138L;

	public MHTFamilyGroupEmployee(Properties ctx, int HT_FamilyGroupEmployee_ID, String trxName) {
		super(ctx, HT_FamilyGroupEmployee_ID, trxName);
	}

	public MHTFamilyGroupEmployee(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

}
