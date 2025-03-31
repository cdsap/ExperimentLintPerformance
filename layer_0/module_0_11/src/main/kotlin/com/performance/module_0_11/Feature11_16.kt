package com.performance.module_0_11

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature11Repository1 {
    private val dataSource = Feature11DataSource1()
    private val mapper = Feature11DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
