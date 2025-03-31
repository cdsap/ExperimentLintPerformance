package com.performance.module_3_274

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature274Repository0 {
    private val dataSource = Feature274DataSource0()
    private val mapper = Feature274DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
