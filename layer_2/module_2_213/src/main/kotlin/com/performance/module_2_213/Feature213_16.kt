package com.performance.module_2_213

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature213Repository1 {
    private val dataSource = Feature213DataSource1()
    private val mapper = Feature213DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
