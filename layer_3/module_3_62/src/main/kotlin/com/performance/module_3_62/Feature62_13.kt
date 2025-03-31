package com.performance.module_3_62

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature62Repository0 {
    private val dataSource = Feature62DataSource0()
    private val mapper = Feature62DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
