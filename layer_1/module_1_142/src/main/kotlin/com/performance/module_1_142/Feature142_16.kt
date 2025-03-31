package com.performance.module_1_142

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature142Repository1 {
    private val dataSource = Feature142DataSource1()
    private val mapper = Feature142DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
