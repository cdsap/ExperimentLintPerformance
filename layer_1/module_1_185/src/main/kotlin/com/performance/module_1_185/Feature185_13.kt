package com.performance.module_1_185

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature185Repository0 {
    private val dataSource = Feature185DataSource0()
    private val mapper = Feature185DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
