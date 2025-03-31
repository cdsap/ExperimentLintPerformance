package com.performance.module_3_268

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature268Repository0 {
    private val dataSource = Feature268DataSource0()
    private val mapper = Feature268DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
