package com.performance.module_0_25

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature25Repository2 {
    private val dataSource = Feature25DataSource2()
    private val mapper = Feature25DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
