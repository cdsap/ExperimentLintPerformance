package com.performance.module_1_22

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature22Repository2 {
    private val dataSource = Feature22DataSource2()
    private val mapper = Feature22DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
