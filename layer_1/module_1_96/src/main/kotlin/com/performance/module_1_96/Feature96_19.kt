package com.performance.module_1_96

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature96Repository2 {
    private val dataSource = Feature96DataSource2()
    private val mapper = Feature96DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
