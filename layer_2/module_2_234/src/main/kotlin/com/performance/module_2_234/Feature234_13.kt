package com.performance.module_2_234

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature234Repository0 {
    private val dataSource = Feature234DataSource0()
    private val mapper = Feature234DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
