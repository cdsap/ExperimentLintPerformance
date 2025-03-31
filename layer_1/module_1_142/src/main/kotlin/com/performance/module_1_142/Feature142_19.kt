package com.performance.module_1_142

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature142Repository2 {
    private val dataSource = Feature142DataSource2()
    private val mapper = Feature142DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
