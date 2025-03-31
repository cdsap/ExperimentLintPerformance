package com.performance.module_0_10

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature10Repository2 {
    private val dataSource = Feature10DataSource2()
    private val mapper = Feature10DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
