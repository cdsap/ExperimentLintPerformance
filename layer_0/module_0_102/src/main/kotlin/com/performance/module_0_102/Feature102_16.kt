package com.performance.module_0_102

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature102Repository1 {
    private val dataSource = Feature102DataSource1()
    private val mapper = Feature102DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
