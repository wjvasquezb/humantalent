package ve.net.dcs.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MHTWorkExperienceEmployee extends X_HT_WorkExperienceEmployee {

	private static final long serialVersionUID = -5474453638981658757L;

	public MHTWorkExperienceEmployee(Properties ctx, int HT_WorkExperienceEmployee_ID, String trxName) {
		super(ctx, HT_WorkExperienceEmployee_ID, trxName);
	}

	public MHTWorkExperienceEmployee(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

}
