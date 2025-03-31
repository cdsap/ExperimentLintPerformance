package com.performance.module_3_262

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature262Repository1 {
    private val dataSource = Feature262DataSource1()
    private val mapper = Feature262DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
