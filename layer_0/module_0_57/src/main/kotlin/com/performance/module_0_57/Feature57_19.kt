package com.performance.module_0_57

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature57Repository2 {
    private val dataSource = Feature57DataSource2()
    private val mapper = Feature57DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
