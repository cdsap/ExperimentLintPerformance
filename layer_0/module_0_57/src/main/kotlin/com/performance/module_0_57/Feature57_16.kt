package com.performance.module_0_57

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature57Repository1 {
    private val dataSource = Feature57DataSource1()
    private val mapper = Feature57DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
