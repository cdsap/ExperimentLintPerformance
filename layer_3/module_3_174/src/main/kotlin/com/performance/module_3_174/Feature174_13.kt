package com.performance.module_3_174

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature174Repository0 {
    private val dataSource = Feature174DataSource0()
    private val mapper = Feature174DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
