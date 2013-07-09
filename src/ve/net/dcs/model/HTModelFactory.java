/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 * Vendor:		Double Click Sistemas C.A. - http://dcs.net.ve				  *
 * Contributor: Saúl Piña - spina@dcs.net.ve                                  *
 *****************************************************************************/

package ve.net.dcs.model;

import java.lang.reflect.Constructor;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.CLogger;
import org.compiere.util.Env;

import ve.net.dcs.info.HTFeatures;

/**
 * Generic Model Factory for Human Talent Plugin
 * 
 * @author Double Click Sistemas C.A. - http://dcs.net.ve
 * @author Saúl Piña - spina@dcs.net.ve
 */
public class HTModelFactory implements IModelFactory {

	private final static CLogger log = CLogger.getCLogger(HTModelFactory.class);
	private final static String prefixTable = "HT_";
	private final static String prefixModel = "MHT";

	@Override
	public Class<?> getClass(String tableName) {

		if (tableName == null || !tableName.startsWith(prefixTable))
			return null;

		Class<?> clazz = null;
		try {
			clazz = Class.forName(String.format("%s.%s%s", HTFeatures.modelPackage, prefixModel, tableName.substring(prefixTable.length())));
		} catch (Exception e) {
			if (log.isLoggable(Level.WARNING))
				log.warning(String.format("Plugin: %s -> Class not found for table: %s", HTFeatures.id, tableName));
		}

		return clazz;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {

		Class<?> clazz = getClass(tableName);
		if (clazz == null)
			return null;

		PO model = null;
		Constructor<?> constructor = null;

		try {
			constructor = clazz.getDeclaredConstructor(new Class[] { Properties.class, int.class, String.class });
			model = (PO) constructor.newInstance(new Object[] { Env.getCtx(), new Integer(Record_ID), trxName });
		} catch (Exception e) {
			if (log.isLoggable(Level.WARNING))
				log.warning(String.format("Plugin: %s -> Class can not be instantiated for table: %s", HTFeatures.id, tableName));
		}

		return model;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {

		Class<?> clazz = getClass(tableName);
		if (clazz == null)
			return null;

		PO model = null;
		Constructor<?> constructor = null;

		try {
			constructor = clazz.getDeclaredConstructor(new Class[] { Properties.class, ResultSet.class, String.class });
			model = (PO) constructor.newInstance(new Object[] { Env.getCtx(), rs, trxName });
		} catch (Exception e) {
			if (log.isLoggable(Level.WARNING))
				log.warning(String.format("Plugin: %s -> Class can not be instantiated for table: %s", HTFeatures.id, tableName));
		}

		return model;
	}

}
