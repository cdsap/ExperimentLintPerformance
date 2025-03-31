package com.performance.module_3_272

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature272Repository2 {
    private val dataSource = Feature272DataSource2()
    private val mapper = Feature272DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
