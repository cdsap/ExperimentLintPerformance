package com.performance.module_2_143

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature143Repository1 {
    private val dataSource = Feature143DataSource1()
    private val mapper = Feature143DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
