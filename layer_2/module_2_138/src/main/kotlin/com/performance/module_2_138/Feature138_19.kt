package com.performance.module_2_138

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature138Repository2 {
    private val dataSource = Feature138DataSource2()
    private val mapper = Feature138DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
