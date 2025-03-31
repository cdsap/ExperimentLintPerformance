package com.performance.module_3_258

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature258Repository2 {
    private val dataSource = Feature258DataSource2()
    private val mapper = Feature258DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
