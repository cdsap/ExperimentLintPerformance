package com.performance.module_1_131

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature131Repository2 {
    private val dataSource = Feature131DataSource2()
    private val mapper = Feature131DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
