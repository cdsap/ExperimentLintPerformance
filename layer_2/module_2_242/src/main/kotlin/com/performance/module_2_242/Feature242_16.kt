package com.performance.module_2_242

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature242Repository1 {
    private val dataSource = Feature242DataSource1()
    private val mapper = Feature242DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
