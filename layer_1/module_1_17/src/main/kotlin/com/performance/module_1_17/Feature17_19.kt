package com.performance.module_1_17

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature17Repository2 {
    private val dataSource = Feature17DataSource2()
    private val mapper = Feature17DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
