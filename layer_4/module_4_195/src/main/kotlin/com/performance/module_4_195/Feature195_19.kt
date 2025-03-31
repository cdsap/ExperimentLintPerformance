package com.performance.module_4_195

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature195Repository2 {
    private val dataSource = Feature195DataSource2()
    private val mapper = Feature195DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
