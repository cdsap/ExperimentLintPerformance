package com.performance.module_0_86

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature86Repository1 {
    private val dataSource = Feature86DataSource1()
    private val mapper = Feature86DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
