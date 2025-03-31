package com.performance.module_1_89

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature89Repository2 {
    private val dataSource = Feature89DataSource2()
    private val mapper = Feature89DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
