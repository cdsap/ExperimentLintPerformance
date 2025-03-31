package com.performance.module_0_125

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature125Repository2 {
    private val dataSource = Feature125DataSource2()
    private val mapper = Feature125DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
