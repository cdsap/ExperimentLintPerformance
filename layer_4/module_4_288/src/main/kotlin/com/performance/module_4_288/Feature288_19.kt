package com.performance.module_4_288

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature288Repository2 {
    private val dataSource = Feature288DataSource2()
    private val mapper = Feature288DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
