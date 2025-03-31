package com.performance.module_0_121

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature121Repository1 {
    private val dataSource = Feature121DataSource1()
    private val mapper = Feature121DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
