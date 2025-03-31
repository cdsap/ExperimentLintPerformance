package com.performance.module_1_89

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature89Repository1 {
    private val dataSource = Feature89DataSource1()
    private val mapper = Feature89DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
