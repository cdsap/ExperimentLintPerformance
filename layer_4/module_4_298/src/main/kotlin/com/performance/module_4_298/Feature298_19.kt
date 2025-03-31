package com.performance.module_4_298

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature298Repository2 {
    private val dataSource = Feature298DataSource2()
    private val mapper = Feature298DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
