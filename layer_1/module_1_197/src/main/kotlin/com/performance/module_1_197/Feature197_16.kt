package com.performance.module_1_197

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature197Repository1 {
    private val dataSource = Feature197DataSource1()
    private val mapper = Feature197DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
