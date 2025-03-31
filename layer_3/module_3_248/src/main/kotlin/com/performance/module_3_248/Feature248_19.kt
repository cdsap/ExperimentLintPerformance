package com.performance.module_3_248

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature248Repository2 {
    private val dataSource = Feature248DataSource2()
    private val mapper = Feature248DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
