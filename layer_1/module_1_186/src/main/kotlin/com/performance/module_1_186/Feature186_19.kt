package com.performance.module_1_186

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature186Repository2 {
    private val dataSource = Feature186DataSource2()
    private val mapper = Feature186DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
