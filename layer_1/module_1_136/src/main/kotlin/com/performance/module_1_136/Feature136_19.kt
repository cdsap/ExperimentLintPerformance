package com.performance.module_1_136

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature136Repository2 {
    private val dataSource = Feature136DataSource2()
    private val mapper = Feature136DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
