package com.performance.module_4_193

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature193Repository1 {
    private val dataSource = Feature193DataSource1()
    private val mapper = Feature193DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
