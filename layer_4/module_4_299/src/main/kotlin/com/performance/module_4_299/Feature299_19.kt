package com.performance.module_4_299

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature299Repository2 {
    private val dataSource = Feature299DataSource2()
    private val mapper = Feature299DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
