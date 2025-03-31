package com.performance.module_1_103

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature103Repository1 {
    private val dataSource = Feature103DataSource1()
    private val mapper = Feature103DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
