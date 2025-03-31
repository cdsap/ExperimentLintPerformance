package com.performance.module_1_194

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature194Repository0 {
    private val dataSource = Feature194DataSource0()
    private val mapper = Feature194DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
