package com.performance.module_1_120

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature120Repository2 {
    private val dataSource = Feature120DataSource2()
    private val mapper = Feature120DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
