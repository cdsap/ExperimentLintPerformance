package com.performance.module_5_201

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature201Repository1 {
    private val dataSource = Feature201DataSource1()
    private val mapper = Feature201DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
