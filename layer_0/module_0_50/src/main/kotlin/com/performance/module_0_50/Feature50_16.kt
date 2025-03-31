package com.performance.module_0_50

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature50Repository1 {
    private val dataSource = Feature50DataSource1()
    private val mapper = Feature50DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
