package com.performance.module_3_243

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature243Repository1 {
    private val dataSource = Feature243DataSource1()
    private val mapper = Feature243DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
