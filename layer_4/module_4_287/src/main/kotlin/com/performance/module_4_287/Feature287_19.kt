package com.performance.module_4_287

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature287Repository2 {
    private val dataSource = Feature287DataSource2()
    private val mapper = Feature287DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
