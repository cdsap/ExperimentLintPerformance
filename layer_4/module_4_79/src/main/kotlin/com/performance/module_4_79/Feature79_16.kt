package com.performance.module_4_79

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature79Repository1 {
    private val dataSource = Feature79DataSource1()
    private val mapper = Feature79DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
