package com.performance.module_4_199

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature199Repository1 {
    private val dataSource = Feature199DataSource1()
    private val mapper = Feature199DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
