package com.performance.module_3_163

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature163Repository2 {
    private val dataSource = Feature163DataSource2()
    private val mapper = Feature163DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
