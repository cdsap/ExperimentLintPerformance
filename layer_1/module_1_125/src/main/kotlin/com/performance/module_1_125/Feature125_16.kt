package com.performance.module_1_125

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature125Repository1 {
    private val dataSource = Feature125DataSource1()
    private val mapper = Feature125DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
