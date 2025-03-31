package com.performance.module_1_178

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature178Repository1 {
    private val dataSource = Feature178DataSource1()
    private val mapper = Feature178DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
