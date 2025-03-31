package com.performance.module_3_168

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature168Repository1 {
    private val dataSource = Feature168DataSource1()
    private val mapper = Feature168DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
