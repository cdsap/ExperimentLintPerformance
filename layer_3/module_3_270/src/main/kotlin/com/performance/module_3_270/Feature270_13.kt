package com.performance.module_3_270

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature270Repository0 {
    private val dataSource = Feature270DataSource0()
    private val mapper = Feature270DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
