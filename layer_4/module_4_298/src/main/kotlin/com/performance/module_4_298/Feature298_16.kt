package com.performance.module_4_298

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature298Repository1 {
    private val dataSource = Feature298DataSource1()
    private val mapper = Feature298DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
