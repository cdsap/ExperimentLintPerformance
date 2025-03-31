package com.performance.module_3_250

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature250Repository2 {
    private val dataSource = Feature250DataSource2()
    private val mapper = Feature250DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
