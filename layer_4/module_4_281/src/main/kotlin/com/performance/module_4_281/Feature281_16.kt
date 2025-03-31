package com.performance.module_4_281

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature281Repository1 {
    private val dataSource = Feature281DataSource1()
    private val mapper = Feature281DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
