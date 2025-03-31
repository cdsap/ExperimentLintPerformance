package com.performance.module_4_196

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature196Repository1 {
    private val dataSource = Feature196DataSource1()
    private val mapper = Feature196DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
