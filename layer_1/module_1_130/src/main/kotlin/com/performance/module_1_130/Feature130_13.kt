package com.performance.module_1_130

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature130Repository0 {
    private val dataSource = Feature130DataSource0()
    private val mapper = Feature130DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
