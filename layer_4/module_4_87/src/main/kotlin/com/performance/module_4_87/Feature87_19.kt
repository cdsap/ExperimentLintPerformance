package com.performance.module_4_87

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature87Repository2 {
    private val dataSource = Feature87DataSource2()
    private val mapper = Feature87DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
