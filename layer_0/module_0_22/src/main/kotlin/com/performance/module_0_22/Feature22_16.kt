package com.performance.module_0_22

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature22Repository1 {
    private val dataSource = Feature22DataSource1()
    private val mapper = Feature22DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
