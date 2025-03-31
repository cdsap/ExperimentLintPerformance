package com.performance.module_4_281

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature281Repository0 {
    private val dataSource = Feature281DataSource0()
    private val mapper = Feature281DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
