package com.performance.module_1_195

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature195Repository0 {
    private val dataSource = Feature195DataSource0()
    private val mapper = Feature195DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
