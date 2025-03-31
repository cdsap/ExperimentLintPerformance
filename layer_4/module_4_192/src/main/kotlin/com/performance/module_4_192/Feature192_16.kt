package com.performance.module_4_192

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature192Repository1 {
    private val dataSource = Feature192DataSource1()
    private val mapper = Feature192DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
