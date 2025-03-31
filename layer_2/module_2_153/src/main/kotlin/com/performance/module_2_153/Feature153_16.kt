package com.performance.module_2_153

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature153Repository1 {
    private val dataSource = Feature153DataSource1()
    private val mapper = Feature153DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
