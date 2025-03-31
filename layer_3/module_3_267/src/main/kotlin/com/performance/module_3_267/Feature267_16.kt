package com.performance.module_3_267

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature267Repository1 {
    private val dataSource = Feature267DataSource1()
    private val mapper = Feature267DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
