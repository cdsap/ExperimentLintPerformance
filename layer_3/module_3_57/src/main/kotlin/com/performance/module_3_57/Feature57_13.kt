package com.performance.module_3_57

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature57Repository0 {
    private val dataSource = Feature57DataSource0()
    private val mapper = Feature57DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
