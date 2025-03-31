package com.performance.module_4_287

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature287Repository1 {
    private val dataSource = Feature287DataSource1()
    private val mapper = Feature287DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
