package com.performance.module_1_24

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature24Repository1 {
    private val dataSource = Feature24DataSource1()
    private val mapper = Feature24DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
