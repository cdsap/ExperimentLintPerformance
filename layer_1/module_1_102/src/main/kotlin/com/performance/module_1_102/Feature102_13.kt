package com.performance.module_1_102

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature102Repository0 {
    private val dataSource = Feature102DataSource0()
    private val mapper = Feature102DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
