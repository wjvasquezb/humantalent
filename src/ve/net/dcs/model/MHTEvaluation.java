package ve.net.dcs.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MHTEvaluation extends X_HT_Evaluation {

	private static final long serialVersionUID = 9054533901746942256L;

	public MHTEvaluation(Properties ctx, int HT_Evaluation_ID, String trxName) {
		super(ctx, HT_Evaluation_ID, trxName);
	}

	public MHTEvaluation(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

}
