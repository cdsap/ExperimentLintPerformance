package com.performance.module_1_179

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature179Repository1 {
    private val dataSource = Feature179DataSource1()
    private val mapper = Feature179DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
