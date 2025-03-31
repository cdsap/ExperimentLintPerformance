package com.performance.module_0_3

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature3Repository2 {
    private val dataSource = Feature3DataSource2()
    private val mapper = Feature3DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
