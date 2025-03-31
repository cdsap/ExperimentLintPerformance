package com.performance.module_3_271

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature271Repository2 {
    private val dataSource = Feature271DataSource2()
    private val mapper = Feature271DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
