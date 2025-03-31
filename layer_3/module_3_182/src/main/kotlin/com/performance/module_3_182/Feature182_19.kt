package com.performance.module_3_182

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature182Repository2 {
    private val dataSource = Feature182DataSource2()
    private val mapper = Feature182DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
