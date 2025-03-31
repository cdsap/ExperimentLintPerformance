package com.performance.module_0_25

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature25Repository1 {
    private val dataSource = Feature25DataSource1()
    private val mapper = Feature25DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
