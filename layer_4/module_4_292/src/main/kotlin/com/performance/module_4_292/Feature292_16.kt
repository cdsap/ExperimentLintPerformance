package com.performance.module_4_292

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature292Repository1 {
    private val dataSource = Feature292DataSource1()
    private val mapper = Feature292DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
