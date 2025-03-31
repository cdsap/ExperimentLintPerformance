package com.performance.module_1_115

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature115Repository1 {
    private val dataSource = Feature115DataSource1()
    private val mapper = Feature115DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
