package com.performance.module_0_123

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature123Repository1 {
    private val dataSource = Feature123DataSource1()
    private val mapper = Feature123DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
