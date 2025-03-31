package com.performance.module_1_129

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature129Repository0 {
    private val dataSource = Feature129DataSource0()
    private val mapper = Feature129DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
