package com.performance.module_0_61

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature61Repository1 {
    private val dataSource = Feature61DataSource1()
    private val mapper = Feature61DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
