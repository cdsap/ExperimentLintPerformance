package com.performance.module_3_252

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature252Repository2 {
    private val dataSource = Feature252DataSource2()
    private val mapper = Feature252DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
