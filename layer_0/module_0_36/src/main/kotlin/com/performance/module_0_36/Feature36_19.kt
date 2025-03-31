package com.performance.module_0_36

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature36Repository2 {
    private val dataSource = Feature36DataSource2()
    private val mapper = Feature36DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
