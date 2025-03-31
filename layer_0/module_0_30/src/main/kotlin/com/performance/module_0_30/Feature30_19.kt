package com.performance.module_0_30

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature30Repository2 {
    private val dataSource = Feature30DataSource2()
    private val mapper = Feature30DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
