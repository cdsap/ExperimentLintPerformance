package com.performance.module_2_221

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature221Repository2 {
    private val dataSource = Feature221DataSource2()
    private val mapper = Feature221DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
