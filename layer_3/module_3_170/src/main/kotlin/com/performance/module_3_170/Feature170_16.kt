package com.performance.module_3_170

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature170Repository1 {
    private val dataSource = Feature170DataSource1()
    private val mapper = Feature170DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
