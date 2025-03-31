package com.performance.module_1_95

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature95Repository2 {
    private val dataSource = Feature95DataSource2()
    private val mapper = Feature95DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
