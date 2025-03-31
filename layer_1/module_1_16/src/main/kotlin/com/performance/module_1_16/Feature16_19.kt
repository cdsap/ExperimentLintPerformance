package com.performance.module_1_16

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature16Repository2 {
    private val dataSource = Feature16DataSource2()
    private val mapper = Feature16DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
