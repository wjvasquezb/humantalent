package ve.net.dcs.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MHTRelationship extends X_HT_Relationship {

	private static final long serialVersionUID = 9106820383327209860L;

	public MHTRelationship(Properties ctx, int HT_Relationship_ID, String trxName) {
		super(ctx, HT_Relationship_ID, trxName);
	}

	public MHTRelationship(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

}
