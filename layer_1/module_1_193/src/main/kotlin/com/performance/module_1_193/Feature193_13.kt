package com.performance.module_1_193

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature193Repository0 {
    private val dataSource = Feature193DataSource0()
    private val mapper = Feature193DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
