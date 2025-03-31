package com.performance.module_3_72

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature72Repository2 {
    private val dataSource = Feature72DataSource2()
    private val mapper = Feature72DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
