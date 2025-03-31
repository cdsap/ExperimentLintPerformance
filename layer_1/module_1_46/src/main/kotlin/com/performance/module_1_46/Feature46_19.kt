package com.performance.module_1_46

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature46Repository2 {
    private val dataSource = Feature46DataSource2()
    private val mapper = Feature46DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
