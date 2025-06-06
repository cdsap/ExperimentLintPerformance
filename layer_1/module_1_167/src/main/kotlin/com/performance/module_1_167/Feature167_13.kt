package com.performance.module_1_167

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature167Repository0 {
    private val dataSource = Feature167DataSource0()
    private val mapper = Feature167DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
