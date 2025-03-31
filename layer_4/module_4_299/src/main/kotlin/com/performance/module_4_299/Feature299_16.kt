package com.performance.module_4_299

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature299Repository1 {
    private val dataSource = Feature299DataSource1()
    private val mapper = Feature299DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
