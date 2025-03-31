package com.performance.module_0_15

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature15Repository1 {
    private val dataSource = Feature15DataSource1()
    private val mapper = Feature15DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
