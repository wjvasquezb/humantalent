package ve.net.dcs.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MHTArticleOfEndowment extends X_HT_ArticleOfEndowment {

	private static final long serialVersionUID = -7678997527112426631L;

	public MHTArticleOfEndowment(Properties ctx, int HT_ArticleOfEndowment_ID, String trxName) {
		super(ctx, HT_ArticleOfEndowment_ID, trxName);
	}

	public MHTArticleOfEndowment(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

}
