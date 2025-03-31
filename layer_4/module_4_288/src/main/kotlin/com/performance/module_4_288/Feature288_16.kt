package com.performance.module_4_288

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature288Repository1 {
    private val dataSource = Feature288DataSource1()
    private val mapper = Feature288DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
