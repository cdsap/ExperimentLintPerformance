package com.performance.module_2_237

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature237Repository2 {
    private val dataSource = Feature237DataSource2()
    private val mapper = Feature237DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
