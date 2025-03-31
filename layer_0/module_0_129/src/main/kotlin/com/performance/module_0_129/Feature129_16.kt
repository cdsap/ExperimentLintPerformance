package com.performance.module_0_129

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature129Repository1 {
    private val dataSource = Feature129DataSource1()
    private val mapper = Feature129DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
