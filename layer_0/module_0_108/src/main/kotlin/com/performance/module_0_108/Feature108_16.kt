package com.performance.module_0_108

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature108Repository1 {
    private val dataSource = Feature108DataSource1()
    private val mapper = Feature108DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
