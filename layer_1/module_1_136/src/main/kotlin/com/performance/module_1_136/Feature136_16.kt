package com.performance.module_1_136

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature136Repository1 {
    private val dataSource = Feature136DataSource1()
    private val mapper = Feature136DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
