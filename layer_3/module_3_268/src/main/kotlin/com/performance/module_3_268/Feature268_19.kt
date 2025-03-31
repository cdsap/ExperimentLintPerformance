package com.performance.module_3_268

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature268Repository2 {
    private val dataSource = Feature268DataSource2()
    private val mapper = Feature268DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
