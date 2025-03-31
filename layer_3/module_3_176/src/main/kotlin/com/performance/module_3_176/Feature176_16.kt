package com.performance.module_3_176

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature176Repository1 {
    private val dataSource = Feature176DataSource1()
    private val mapper = Feature176DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
