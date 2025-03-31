package com.performance.module_1_118

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature118Repository2 {
    private val dataSource = Feature118DataSource2()
    private val mapper = Feature118DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
