package com.performance.module_2_234

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature234Repository1 {
    private val dataSource = Feature234DataSource1()
    private val mapper = Feature234DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
