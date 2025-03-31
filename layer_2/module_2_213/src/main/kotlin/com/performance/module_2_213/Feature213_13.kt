package com.performance.module_2_213

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature213Repository0 {
    private val dataSource = Feature213DataSource0()
    private val mapper = Feature213DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
