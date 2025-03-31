package com.performance.module_1_190

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature190Repository0 {
    private val dataSource = Feature190DataSource0()
    private val mapper = Feature190DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
