package com.performance.module_3_267

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature267Repository2 {
    private val dataSource = Feature267DataSource2()
    private val mapper = Feature267DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
