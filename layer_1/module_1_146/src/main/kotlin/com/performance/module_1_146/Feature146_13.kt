package com.performance.module_1_146

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature146Repository0 {
    private val dataSource = Feature146DataSource0()
    private val mapper = Feature146DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
