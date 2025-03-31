package com.performance.module_3_167

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature167Repository1 {
    private val dataSource = Feature167DataSource1()
    private val mapper = Feature167DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
