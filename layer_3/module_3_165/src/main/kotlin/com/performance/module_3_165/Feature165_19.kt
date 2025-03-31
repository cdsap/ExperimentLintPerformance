package com.performance.module_3_165

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature165Repository2 {
    private val dataSource = Feature165DataSource2()
    private val mapper = Feature165DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
