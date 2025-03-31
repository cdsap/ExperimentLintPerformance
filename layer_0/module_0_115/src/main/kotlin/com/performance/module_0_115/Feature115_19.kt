package com.performance.module_0_115

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature115Repository2 {
    private val dataSource = Feature115DataSource2()
    private val mapper = Feature115DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
