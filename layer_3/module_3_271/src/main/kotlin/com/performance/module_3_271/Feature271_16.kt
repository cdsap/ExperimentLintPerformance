package com.performance.module_3_271

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature271Repository1 {
    private val dataSource = Feature271DataSource1()
    private val mapper = Feature271DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
