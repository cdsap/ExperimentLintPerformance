package com.performance.module_1_21

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature21Repository2 {
    private val dataSource = Feature21DataSource2()
    private val mapper = Feature21DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
