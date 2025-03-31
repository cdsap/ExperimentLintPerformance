package com.performance.module_4_283

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature283Repository1 {
    private val dataSource = Feature283DataSource1()
    private val mapper = Feature283DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
