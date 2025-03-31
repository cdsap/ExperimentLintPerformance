package com.performance.module_0_62

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature62Repository2 {
    private val dataSource = Feature62DataSource2()
    private val mapper = Feature62DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
