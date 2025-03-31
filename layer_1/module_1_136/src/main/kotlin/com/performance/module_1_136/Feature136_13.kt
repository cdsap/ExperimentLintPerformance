package com.performance.module_1_136

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature136Repository0 {
    private val dataSource = Feature136DataSource0()
    private val mapper = Feature136DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
