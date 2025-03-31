package com.performance.module_4_296

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature296Repository1 {
    private val dataSource = Feature296DataSource1()
    private val mapper = Feature296DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
