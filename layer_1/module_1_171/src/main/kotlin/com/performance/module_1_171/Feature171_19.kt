package com.performance.module_1_171

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature171Repository2 {
    private val dataSource = Feature171DataSource2()
    private val mapper = Feature171DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
