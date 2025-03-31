package com.performance.module_2_141

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature141Repository0 {
    private val dataSource = Feature141DataSource0()
    private val mapper = Feature141DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
