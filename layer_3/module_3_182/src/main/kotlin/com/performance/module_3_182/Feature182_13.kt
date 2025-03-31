package com.performance.module_3_182

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature182Repository0 {
    private val dataSource = Feature182DataSource0()
    private val mapper = Feature182DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
