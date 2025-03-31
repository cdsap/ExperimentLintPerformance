package com.performance.module_1_16

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature16Repository1 {
    private val dataSource = Feature16DataSource1()
    private val mapper = Feature16DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
