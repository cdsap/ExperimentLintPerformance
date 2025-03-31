package com.performance.module_1_133

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature133Repository1 {
    private val dataSource = Feature133DataSource1()
    private val mapper = Feature133DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
