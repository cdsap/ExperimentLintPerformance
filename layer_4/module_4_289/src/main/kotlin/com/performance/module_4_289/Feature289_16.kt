package com.performance.module_4_289

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature289Repository1 {
    private val dataSource = Feature289DataSource1()
    private val mapper = Feature289DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
