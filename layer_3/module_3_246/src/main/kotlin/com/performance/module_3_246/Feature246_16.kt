package com.performance.module_3_246

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature246Repository1 {
    private val dataSource = Feature246DataSource1()
    private val mapper = Feature246DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
