package com.performance.module_0_79

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature79Repository0 {
    private val dataSource = Feature79DataSource0()
    private val mapper = Feature79DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
