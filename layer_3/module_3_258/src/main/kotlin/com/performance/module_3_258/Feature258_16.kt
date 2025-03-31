package com.performance.module_3_258

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature258Repository1 {
    private val dataSource = Feature258DataSource1()
    private val mapper = Feature258DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
