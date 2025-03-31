package com.performance.module_3_72

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature72Repository0 {
    private val dataSource = Feature72DataSource0()
    private val mapper = Feature72DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
