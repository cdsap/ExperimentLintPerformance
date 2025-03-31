package com.performance.module_1_172

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature172Repository2 {
    private val dataSource = Feature172DataSource2()
    private val mapper = Feature172DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
