package com.performance.module_4_281

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature281Repository2 {
    private val dataSource = Feature281DataSource2()
    private val mapper = Feature281DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
