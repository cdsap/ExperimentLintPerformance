package com.performance.module_0_36

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature36Repository1 {
    private val dataSource = Feature36DataSource1()
    private val mapper = Feature36DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
