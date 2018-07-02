package ve.net.dcs.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MHTEvaluationEmployee extends X_HT_EvaluationEmployee {

	private static final long serialVersionUID = 1790488647999985994L;

	public MHTEvaluationEmployee(Properties ctx, int HT_EvaluationEmployee_ID, String trxName) {
		super(ctx, HT_EvaluationEmployee_ID, trxName);
	}

	public MHTEvaluationEmployee(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

}
