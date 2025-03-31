package com.performance.module_4_289

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature289Repository0 {
    private val dataSource = Feature289DataSource0()
    private val mapper = Feature289DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
