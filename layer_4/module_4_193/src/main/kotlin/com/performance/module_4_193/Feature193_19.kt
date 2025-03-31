package com.performance.module_4_193

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature193Repository2 {
    private val dataSource = Feature193DataSource2()
    private val mapper = Feature193DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
