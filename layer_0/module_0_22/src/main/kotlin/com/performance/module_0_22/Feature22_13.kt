package com.performance.module_0_22

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature22Repository0 {
    private val dataSource = Feature22DataSource0()
    private val mapper = Feature22DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
