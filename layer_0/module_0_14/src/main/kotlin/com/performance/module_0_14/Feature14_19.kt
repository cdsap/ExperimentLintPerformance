package com.performance.module_0_14

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature14Repository2 {
    private val dataSource = Feature14DataSource2()
    private val mapper = Feature14DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
