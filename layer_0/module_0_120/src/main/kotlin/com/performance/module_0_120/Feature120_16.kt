package com.performance.module_0_120

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature120Repository1 {
    private val dataSource = Feature120DataSource1()
    private val mapper = Feature120DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
