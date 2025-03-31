package com.performance.module_4_185

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature185Repository1 {
    private val dataSource = Feature185DataSource1()
    private val mapper = Feature185DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
