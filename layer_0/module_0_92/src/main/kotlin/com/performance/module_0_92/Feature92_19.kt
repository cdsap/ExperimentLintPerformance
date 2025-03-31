package com.performance.module_0_92

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature92Repository2 {
    private val dataSource = Feature92DataSource2()
    private val mapper = Feature92DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
