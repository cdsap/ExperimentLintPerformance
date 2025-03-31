package com.performance.module_1_110

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature110Repository2 {
    private val dataSource = Feature110DataSource2()
    private val mapper = Feature110DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
