package com.performance.module_1_121

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature121Repository2 {
    private val dataSource = Feature121DataSource2()
    private val mapper = Feature121DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
