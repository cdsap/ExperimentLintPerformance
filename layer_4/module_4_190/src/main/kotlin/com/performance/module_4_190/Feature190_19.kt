package com.performance.module_4_190

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature190Repository2 {
    private val dataSource = Feature190DataSource2()
    private val mapper = Feature190DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
