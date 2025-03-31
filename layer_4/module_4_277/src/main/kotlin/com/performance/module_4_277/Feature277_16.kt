package com.performance.module_4_277

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature277Repository1 {
    private val dataSource = Feature277DataSource1()
    private val mapper = Feature277DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
