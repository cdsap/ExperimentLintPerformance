package com.performance.module_4_192

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature192Repository2 {
    private val dataSource = Feature192DataSource2()
    private val mapper = Feature192DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
