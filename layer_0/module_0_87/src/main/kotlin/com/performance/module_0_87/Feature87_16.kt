package com.performance.module_0_87

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature87Repository1 {
    private val dataSource = Feature87DataSource1()
    private val mapper = Feature87DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
