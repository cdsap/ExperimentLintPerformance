package com.performance.module_3_243

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature243Repository2 {
    private val dataSource = Feature243DataSource2()
    private val mapper = Feature243DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
