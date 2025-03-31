package com.performance.module_2_199

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature199Repository2 {
    private val dataSource = Feature199DataSource2()
    private val mapper = Feature199DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
