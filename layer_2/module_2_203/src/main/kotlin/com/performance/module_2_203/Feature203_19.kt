package com.performance.module_2_203

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature203Repository2 {
    private val dataSource = Feature203DataSource2()
    private val mapper = Feature203DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
