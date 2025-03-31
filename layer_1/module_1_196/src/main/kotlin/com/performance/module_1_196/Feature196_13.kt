package com.performance.module_1_196

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature196Repository0 {
    private val dataSource = Feature196DataSource0()
    private val mapper = Feature196DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
