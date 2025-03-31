package com.performance.module_4_294

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature294Repository0 {
    private val dataSource = Feature294DataSource0()
    private val mapper = Feature294DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
