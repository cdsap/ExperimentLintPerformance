package com.performance.module_1_190

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature190Repository1 {
    private val dataSource = Feature190DataSource1()
    private val mapper = Feature190DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
