package com.performance.module_1_178

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature178Repository2 {
    private val dataSource = Feature178DataSource2()
    private val mapper = Feature178DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
