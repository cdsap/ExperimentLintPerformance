package com.performance.module_1_176

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature176Repository2 {
    private val dataSource = Feature176DataSource2()
    private val mapper = Feature176DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
