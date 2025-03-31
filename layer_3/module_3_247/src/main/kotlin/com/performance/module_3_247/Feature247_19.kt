package com.performance.module_3_247

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature247Repository2 {
    private val dataSource = Feature247DataSource2()
    private val mapper = Feature247DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
