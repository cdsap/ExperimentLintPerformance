package com.performance.module_1_107

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature107Repository1 {
    private val dataSource = Feature107DataSource1()
    private val mapper = Feature107DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
