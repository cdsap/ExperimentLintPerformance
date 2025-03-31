package com.performance.module_2_203

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature203Repository0 {
    private val dataSource = Feature203DataSource0()
    private val mapper = Feature203DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
