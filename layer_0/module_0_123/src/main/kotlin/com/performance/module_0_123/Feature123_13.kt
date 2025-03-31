package com.performance.module_0_123

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature123Repository0 {
    private val dataSource = Feature123DataSource0()
    private val mapper = Feature123DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
