package com.performance.module_0_11

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature11Repository2 {
    private val dataSource = Feature11DataSource2()
    private val mapper = Feature11DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
