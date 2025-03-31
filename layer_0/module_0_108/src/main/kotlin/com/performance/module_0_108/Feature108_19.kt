package com.performance.module_0_108

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature108Repository2 {
    private val dataSource = Feature108DataSource2()
    private val mapper = Feature108DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
