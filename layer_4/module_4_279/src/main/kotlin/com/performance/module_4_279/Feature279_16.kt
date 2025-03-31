package com.performance.module_4_279

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature279Repository1 {
    private val dataSource = Feature279DataSource1()
    private val mapper = Feature279DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
