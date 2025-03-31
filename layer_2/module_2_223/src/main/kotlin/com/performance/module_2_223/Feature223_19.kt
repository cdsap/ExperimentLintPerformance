package com.performance.module_2_223

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature223Repository2 {
    private val dataSource = Feature223DataSource2()
    private val mapper = Feature223DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
