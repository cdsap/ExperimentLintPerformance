package com.performance.module_4_276

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature276Repository0 {
    private val dataSource = Feature276DataSource0()
    private val mapper = Feature276DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
