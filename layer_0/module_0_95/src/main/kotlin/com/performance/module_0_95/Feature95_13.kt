package com.performance.module_0_95

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature95Repository0 {
    private val dataSource = Feature95DataSource0()
    private val mapper = Feature95DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
