package com.performance.module_4_275

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature275Repository0 {
    private val dataSource = Feature275DataSource0()
    private val mapper = Feature275DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
