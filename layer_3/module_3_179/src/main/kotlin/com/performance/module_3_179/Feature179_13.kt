package com.performance.module_3_179

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature179Repository0 {
    private val dataSource = Feature179DataSource0()
    private val mapper = Feature179DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
