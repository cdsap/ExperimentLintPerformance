package com.performance.module_1_171

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature171Repository1 {
    private val dataSource = Feature171DataSource1()
    private val mapper = Feature171DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
