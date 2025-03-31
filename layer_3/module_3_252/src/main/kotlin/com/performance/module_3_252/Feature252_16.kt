package com.performance.module_3_252

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature252Repository1 {
    private val dataSource = Feature252DataSource1()
    private val mapper = Feature252DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
