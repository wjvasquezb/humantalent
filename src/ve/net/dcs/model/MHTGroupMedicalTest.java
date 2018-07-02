package ve.net.dcs.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MHTGroupMedicalTest extends X_HT_GroupMedicalTest {

	private static final long serialVersionUID = -8825608008168342655L;

	public MHTGroupMedicalTest(Properties ctx, int HT_GroupMedicalTest_ID, String trxName) {
		super(ctx, HT_GroupMedicalTest_ID, trxName);
	}

	public MHTGroupMedicalTest(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

}
