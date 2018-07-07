package com.ingeint.process;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

import org.compiere.util.DB;

import com.ingeint.base.CustomProcess;
import com.ingeint.model.MHTPersonalRequisition;
import com.ingeint.model.MHTPersonalRequisitionLine;

public class HTLoadProspect extends CustomProcess{

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	@Override
	protected String doIt() throws Exception {

		MHTPersonalRequisition pr = new MHTPersonalRequisition(getCtx(), getRecord_ID(), get_TrxName());

		StringBuffer sql = new StringBuffer("SELECT C_BPartner_ID, isemployee, ishrprospect , ht_career_id "
				+ "FROM HR_Prospect "
				+ "WHERE AD_Client_ID = ? AND HT_Career_id IN (");

		sql.append(pr.getHT_Career_ID());

		if (pr.getHT_Career2_ID()>0)
			sql.append(","+pr.getHT_Career2_ID());

		if (pr.getHT_Career3_ID()>0)
			sql.append(","+pr.getHT_Career3_ID());

		sql.append(")");

		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), get_TrxName());
			pstmt.setInt(1, pr.getAD_Client_ID());
			ResultSet rs = pstmt.executeQuery();

			while (rs.next())
			{
				MHTPersonalRequisitionLine rl = new MHTPersonalRequisitionLine(pr);
				rl.setC_BPartner_ID(rs.getInt(1));
				rl.setIsEmployee(rs.getBoolean(2));
				rl.setIsHRProspect(rs.getBoolean(3));
				rl.saveEx();
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
			return "Error "+e;
		}

		return null;
	}

}
