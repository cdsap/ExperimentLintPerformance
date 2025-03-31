package com.performance.module_1_92

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature92Repository1 {
    private val dataSource = Feature92DataSource1()
    private val mapper = Feature92DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
