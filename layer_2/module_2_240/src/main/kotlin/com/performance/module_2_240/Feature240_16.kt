package com.performance.module_2_240

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature240Repository1 {
    private val dataSource = Feature240DataSource1()
    private val mapper = Feature240DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
