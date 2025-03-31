package com.performance.module_1_182

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature182Repository1 {
    private val dataSource = Feature182DataSource1()
    private val mapper = Feature182DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
