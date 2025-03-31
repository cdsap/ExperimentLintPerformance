package com.performance.module_4_197

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature197Repository2 {
    private val dataSource = Feature197DataSource2()
    private val mapper = Feature197DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
