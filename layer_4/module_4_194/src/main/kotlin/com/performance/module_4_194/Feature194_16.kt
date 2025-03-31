package com.performance.module_4_194

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature194Repository1 {
    private val dataSource = Feature194DataSource1()
    private val mapper = Feature194DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
