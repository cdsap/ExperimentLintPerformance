package com.performance.module_1_25

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature25Repository0 {
    private val dataSource = Feature25DataSource0()
    private val mapper = Feature25DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
