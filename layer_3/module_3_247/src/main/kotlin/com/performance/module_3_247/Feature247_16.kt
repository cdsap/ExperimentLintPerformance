package com.performance.module_3_247

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature247Repository1 {
    private val dataSource = Feature247DataSource1()
    private val mapper = Feature247DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
