package com.performance.module_2_155

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature155Repository1 {
    private val dataSource = Feature155DataSource1()
    private val mapper = Feature155DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
