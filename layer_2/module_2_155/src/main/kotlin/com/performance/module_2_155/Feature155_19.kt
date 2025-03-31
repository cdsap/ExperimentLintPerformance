package com.performance.module_2_155

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature155Repository2 {
    private val dataSource = Feature155DataSource2()
    private val mapper = Feature155DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
