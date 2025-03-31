package com.performance.module_3_243

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature243Repository0 {
    private val dataSource = Feature243DataSource0()
    private val mapper = Feature243DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
