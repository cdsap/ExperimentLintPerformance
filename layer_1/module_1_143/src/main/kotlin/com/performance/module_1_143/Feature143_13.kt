package com.performance.module_1_143

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature143Repository0 {
    private val dataSource = Feature143DataSource0()
    private val mapper = Feature143DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
