package com.performance.module_4_197

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature197Repository0 {
    private val dataSource = Feature197DataSource0()
    private val mapper = Feature197DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
