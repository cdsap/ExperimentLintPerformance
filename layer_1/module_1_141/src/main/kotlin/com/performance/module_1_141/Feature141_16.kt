package com.performance.module_1_141

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature141Repository1 {
    private val dataSource = Feature141DataSource1()
    private val mapper = Feature141DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
