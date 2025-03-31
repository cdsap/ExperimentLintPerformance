package com.performance.module_2_222

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature222Repository1 {
    private val dataSource = Feature222DataSource1()
    private val mapper = Feature222DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
