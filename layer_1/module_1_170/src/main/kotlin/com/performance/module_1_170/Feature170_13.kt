package com.performance.module_1_170

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature170Repository0 {
    private val dataSource = Feature170DataSource0()
    private val mapper = Feature170DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
