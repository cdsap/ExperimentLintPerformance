package com.performance.module_1_108

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature108Repository0 {
    private val dataSource = Feature108DataSource0()
    private val mapper = Feature108DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
