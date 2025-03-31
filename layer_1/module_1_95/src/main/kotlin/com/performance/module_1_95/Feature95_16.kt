package com.performance.module_1_95

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature95Repository1 {
    private val dataSource = Feature95DataSource1()
    private val mapper = Feature95DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
