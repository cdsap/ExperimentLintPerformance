package com.performance.module_1_110

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature110Repository1 {
    private val dataSource = Feature110DataSource1()
    private val mapper = Feature110DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
