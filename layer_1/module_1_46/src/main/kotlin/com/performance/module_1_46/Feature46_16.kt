package com.performance.module_1_46

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature46Repository1 {
    private val dataSource = Feature46DataSource1()
    private val mapper = Feature46DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
