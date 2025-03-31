package com.performance.module_1_129

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature129Repository2 {
    private val dataSource = Feature129DataSource2()
    private val mapper = Feature129DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
