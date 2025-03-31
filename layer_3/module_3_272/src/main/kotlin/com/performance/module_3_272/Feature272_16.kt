package com.performance.module_3_272

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature272Repository1 {
    private val dataSource = Feature272DataSource1()
    private val mapper = Feature272DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
