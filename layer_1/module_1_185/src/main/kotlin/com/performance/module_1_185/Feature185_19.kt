package com.performance.module_1_185

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature185Repository2 {
    private val dataSource = Feature185DataSource2()
    private val mapper = Feature185DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
