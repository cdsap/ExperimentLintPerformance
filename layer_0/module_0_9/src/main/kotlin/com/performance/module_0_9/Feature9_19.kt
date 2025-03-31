package com.performance.module_0_9

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature9Repository2 {
    private val dataSource = Feature9DataSource2()
    private val mapper = Feature9DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
