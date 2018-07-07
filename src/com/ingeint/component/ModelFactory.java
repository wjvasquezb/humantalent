/**
 * This file is part of iDempiere ERP <http://www.idempiere.org>.
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * 
 * Copyright (C) 2015 INGEINT <http://www.ingeint.com>.
 * Copyright (C) Contributors.
 * 
 * Contributors:
 *    - 2015 Saúl Piña <spina@ingeint.com>.
 *    - 2015 Freddy Heredia <freddy.heredia@ingeint.com>.
 */

package com.ingeint.component;

import com.ingeint.base.CustomModelFactory;
import com.ingeint.model.MHTPersonalRequisition;
import com.ingeint.model.MHTPersonalRequisitionLine;

/**
 * Model Factory
 */
public class ModelFactory extends CustomModelFactory {

	@Override
	protected void initialize() {
		registerTableModel(MHTPersonalRequisition.Table_Name, MHTPersonalRequisition.class);
		registerTableModel(MHTPersonalRequisitionLine.Table_Name, MHTPersonalRequisitionLine.class);
		// Register the models class to build
		
	}
}
