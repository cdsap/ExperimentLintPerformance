package com.performance.module_3_60

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature60Repository1 {
    private val dataSource = Feature60DataSource1()
    private val mapper = Feature60DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
