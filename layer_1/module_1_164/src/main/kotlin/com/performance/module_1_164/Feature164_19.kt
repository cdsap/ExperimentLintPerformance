package com.performance.module_1_164

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature164Repository2 {
    private val dataSource = Feature164DataSource2()
    private val mapper = Feature164DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
