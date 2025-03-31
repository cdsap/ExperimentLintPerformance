package com.performance.module_1_36

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature36Repository0 {
    private val dataSource = Feature36DataSource0()
    private val mapper = Feature36DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
