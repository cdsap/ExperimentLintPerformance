package com.performance.module_0_72

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature72Repository1 {
    private val dataSource = Feature72DataSource1()
    private val mapper = Feature72DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
