package ve.net.dcs.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MHTTypeMedicalTest extends X_HT_TypeMedicalTest {

	private static final long serialVersionUID = -3966767900811615289L;

	public MHTTypeMedicalTest(Properties ctx, int HT_TypeMedicalTest_ID, String trxName) {
		super(ctx, HT_TypeMedicalTest_ID, trxName);
	}

	public MHTTypeMedicalTest(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

}
