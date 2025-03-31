package com.performance.module_0_24

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature24Repository2 {
    private val dataSource = Feature24DataSource2()
    private val mapper = Feature24DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
