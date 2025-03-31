package com.performance.module_0_13

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature13Repository2 {
    private val dataSource = Feature13DataSource2()
    private val mapper = Feature13DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
