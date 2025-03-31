package com.performance.module_1_96

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature96Repository1 {
    private val dataSource = Feature96DataSource1()
    private val mapper = Feature96DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
