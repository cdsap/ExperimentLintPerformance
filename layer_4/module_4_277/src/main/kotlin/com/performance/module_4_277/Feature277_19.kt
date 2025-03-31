package com.performance.module_4_277

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature277Repository2 {
    private val dataSource = Feature277DataSource2()
    private val mapper = Feature277DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
