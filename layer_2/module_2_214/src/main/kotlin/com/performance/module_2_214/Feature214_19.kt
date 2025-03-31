package com.performance.module_2_214

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature214Repository2 {
    private val dataSource = Feature214DataSource2()
    private val mapper = Feature214DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
