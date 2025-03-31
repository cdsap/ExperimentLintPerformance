package com.performance.module_4_275

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature275Repository1 {
    private val dataSource = Feature275DataSource1()
    private val mapper = Feature275DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
