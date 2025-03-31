package com.performance.module_1_153

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature153Repository2 {
    private val dataSource = Feature153DataSource2()
    private val mapper = Feature153DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
