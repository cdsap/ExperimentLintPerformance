package com.performance.module_1_141

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature141Repository2 {
    private val dataSource = Feature141DataSource2()
    private val mapper = Feature141DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
