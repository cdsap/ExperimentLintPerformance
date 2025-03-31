package com.performance.module_3_274

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature274Repository2 {
    private val dataSource = Feature274DataSource2()
    private val mapper = Feature274DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
