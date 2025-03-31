package com.performance.module_3_270

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature270Repository1 {
    private val dataSource = Feature270DataSource1()
    private val mapper = Feature270DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
