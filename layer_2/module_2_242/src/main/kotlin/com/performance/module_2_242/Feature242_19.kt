package com.performance.module_2_242

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature242Repository2 {
    private val dataSource = Feature242DataSource2()
    private val mapper = Feature242DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
