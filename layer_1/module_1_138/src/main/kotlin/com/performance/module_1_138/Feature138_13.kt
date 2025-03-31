package com.performance.module_1_138

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature138Repository0 {
    private val dataSource = Feature138DataSource0()
    private val mapper = Feature138DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
