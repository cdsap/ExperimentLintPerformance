package com.performance.module_0_14

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature14Repository1 {
    private val dataSource = Feature14DataSource1()
    private val mapper = Feature14DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
