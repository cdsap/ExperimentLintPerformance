package com.performance.module_4_194

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature194Repository2 {
    private val dataSource = Feature194DataSource2()
    private val mapper = Feature194DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
