package ve.net.dcs.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MHTMedicalTestEmployee extends X_HT_MedicalTestEmployee {

	private static final long serialVersionUID = 8171564850282700466L;

	public MHTMedicalTestEmployee(Properties ctx, int HT_MedicalTestEmployee_ID, String trxName) {
		super(ctx, HT_MedicalTestEmployee_ID, trxName);
	}

	public MHTMedicalTestEmployee(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

}
