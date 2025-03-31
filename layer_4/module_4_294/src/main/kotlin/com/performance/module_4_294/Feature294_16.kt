package com.performance.module_4_294

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature294Repository1 {
    private val dataSource = Feature294DataSource1()
    private val mapper = Feature294DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
