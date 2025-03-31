package com.performance.module_1_102

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature102Repository2 {
    private val dataSource = Feature102DataSource2()
    private val mapper = Feature102DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
