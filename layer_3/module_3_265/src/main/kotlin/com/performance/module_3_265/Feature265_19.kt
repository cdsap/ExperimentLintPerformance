package com.performance.module_3_265

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature265Repository2 {
    private val dataSource = Feature265DataSource2()
    private val mapper = Feature265DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
