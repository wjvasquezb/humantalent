package ve.net.dcs.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MHTAcademicTrainingEmployee extends X_HT_AcademicTrainingEmployee {

	private static final long serialVersionUID = -2147966412808133817L;

	public MHTAcademicTrainingEmployee(Properties ctx, int HT_AcademicTrainingEmployee_ID, String trxName) {
		super(ctx, HT_AcademicTrainingEmployee_ID, trxName);
	}

	public MHTAcademicTrainingEmployee(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

}
