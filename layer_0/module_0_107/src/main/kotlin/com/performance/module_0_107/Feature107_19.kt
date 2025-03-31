package com.performance.module_0_107

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature107Repository2 {
    private val dataSource = Feature107DataSource2()
    private val mapper = Feature107DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
