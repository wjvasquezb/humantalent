package ve.net.dcs.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MHTMedicalConsultEmployee extends X_HT_MedicalConsultEmployee {

	private static final long serialVersionUID = 7253848184384382314L;

	public MHTMedicalConsultEmployee(Properties ctx, int HT_MedicalConsultEmployee_ID, String trxName) {
		super(ctx, HT_MedicalConsultEmployee_ID, trxName);
	}

	public MHTMedicalConsultEmployee(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

}
