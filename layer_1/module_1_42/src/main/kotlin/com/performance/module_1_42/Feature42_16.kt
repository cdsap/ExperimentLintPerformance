package com.performance.module_1_42

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature42Repository1 {
    private val dataSource = Feature42DataSource1()
    private val mapper = Feature42DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
