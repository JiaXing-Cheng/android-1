/**
 * ownCloud Android client application
 *
 * @author David González Verdugo
 * Copyright (C) 2019 ownCloud GmbH.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.owncloud.android.shares.datasources

import android.app.Application
import com.owncloud.android.lib.resources.shares.RemoteShare
import com.owncloud.android.shares.db.OCShare
import java.util.*

interface RemoteSharesDataSource {
    suspend fun getShares(application: Application): List<OCShare>
    fun getSharesForAFile(path: String, reshares: Boolean, subfiles: Boolean): ArrayList<RemoteShare>
}