package com.performance.module_0_13

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature13Repository1 {
    private val dataSource = Feature13DataSource1()
    private val mapper = Feature13DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
