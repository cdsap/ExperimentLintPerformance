package com.performance.module_4_277

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature277Repository0 {
    private val dataSource = Feature277DataSource0()
    private val mapper = Feature277DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
