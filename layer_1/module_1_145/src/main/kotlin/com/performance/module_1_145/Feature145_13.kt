package com.performance.module_1_145

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature145Repository0 {
    private val dataSource = Feature145DataSource0()
    private val mapper = Feature145DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
