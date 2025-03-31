package com.performance.module_2_158

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature158Repository2 {
    private val dataSource = Feature158DataSource2()
    private val mapper = Feature158DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
