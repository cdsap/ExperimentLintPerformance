package com.performance.module_2_214

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature214Repository0 {
    private val dataSource = Feature214DataSource0()
    private val mapper = Feature214DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
