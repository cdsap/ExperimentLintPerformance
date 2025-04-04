package com.performance.module_2_240

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature240Repository0 {
    private val dataSource = Feature240DataSource0()
    private val mapper = Feature240DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
