package com.performance.module_2_138

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature138Repository1 {
    private val dataSource = Feature138DataSource1()
    private val mapper = Feature138DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
