package com.performance.module_1_139

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature139Repository2 {
    private val dataSource = Feature139DataSource2()
    private val mapper = Feature139DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
