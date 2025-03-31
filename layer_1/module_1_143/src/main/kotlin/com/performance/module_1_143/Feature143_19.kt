package com.performance.module_1_143

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature143Repository2 {
    private val dataSource = Feature143DataSource2()
    private val mapper = Feature143DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
