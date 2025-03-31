package com.performance.module_0_3

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature3Repository1 {
    private val dataSource = Feature3DataSource1()
    private val mapper = Feature3DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
