package com.performance.module_4_275

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature275Repository2 {
    private val dataSource = Feature275DataSource2()
    private val mapper = Feature275DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
