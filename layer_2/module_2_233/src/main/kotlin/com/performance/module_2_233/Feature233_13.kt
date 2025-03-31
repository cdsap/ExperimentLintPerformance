package com.performance.module_2_233

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature233Repository0 {
    private val dataSource = Feature233DataSource0()
    private val mapper = Feature233DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
