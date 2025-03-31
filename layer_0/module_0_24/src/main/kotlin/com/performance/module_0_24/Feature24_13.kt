package com.performance.module_0_24

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature24Repository0 {
    private val dataSource = Feature24DataSource0()
    private val mapper = Feature24DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
