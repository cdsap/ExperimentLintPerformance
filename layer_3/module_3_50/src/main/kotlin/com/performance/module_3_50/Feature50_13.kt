package com.performance.module_3_50

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature50Repository0 {
    private val dataSource = Feature50DataSource0()
    private val mapper = Feature50DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
