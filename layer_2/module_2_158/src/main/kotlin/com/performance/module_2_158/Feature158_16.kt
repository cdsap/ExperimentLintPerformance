package com.performance.module_2_158

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature158Repository1 {
    private val dataSource = Feature158DataSource1()
    private val mapper = Feature158DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
