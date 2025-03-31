package com.performance.module_4_283

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature283Repository0 {
    private val dataSource = Feature283DataSource0()
    private val mapper = Feature283DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
