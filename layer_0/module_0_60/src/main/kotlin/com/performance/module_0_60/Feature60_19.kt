package com.performance.module_0_60

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature60Repository2 {
    private val dataSource = Feature60DataSource2()
    private val mapper = Feature60DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
