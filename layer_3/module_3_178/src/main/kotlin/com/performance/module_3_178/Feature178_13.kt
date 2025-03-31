package com.performance.module_3_178

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature178Repository0 {
    private val dataSource = Feature178DataSource0()
    private val mapper = Feature178DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
