package com.performance.module_2_223

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature223Repository1 {
    private val dataSource = Feature223DataSource1()
    private val mapper = Feature223DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
