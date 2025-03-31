package com.performance.module_1_123

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature123Repository2 {
    private val dataSource = Feature123DataSource2()
    private val mapper = Feature123DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
