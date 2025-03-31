package com.performance.module_1_92

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature92Repository0 {
    private val dataSource = Feature92DataSource0()
    private val mapper = Feature92DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
