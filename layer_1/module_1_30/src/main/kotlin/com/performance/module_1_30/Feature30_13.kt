package com.performance.module_1_30

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature30Repository0 {
    private val dataSource = Feature30DataSource0()
    private val mapper = Feature30DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
