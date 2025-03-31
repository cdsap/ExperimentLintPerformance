package com.performance.module_3_248

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature248Repository0 {
    private val dataSource = Feature248DataSource0()
    private val mapper = Feature248DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
