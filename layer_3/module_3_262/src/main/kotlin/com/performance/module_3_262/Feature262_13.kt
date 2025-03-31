package com.performance.module_3_262

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature262Repository0 {
    private val dataSource = Feature262DataSource0()
    private val mapper = Feature262DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
