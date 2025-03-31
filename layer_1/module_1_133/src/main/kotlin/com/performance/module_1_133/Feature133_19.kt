package com.performance.module_1_133

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature133Repository2 {
    private val dataSource = Feature133DataSource2()
    private val mapper = Feature133DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
