package com.performance.module_1_196

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature196Repository2 {
    private val dataSource = Feature196DataSource2()
    private val mapper = Feature196DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
