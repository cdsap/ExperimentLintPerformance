package com.performance.module_1_158

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature158Repository0 {
    private val dataSource = Feature158DataSource0()
    private val mapper = Feature158DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
