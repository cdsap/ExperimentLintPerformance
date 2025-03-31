package com.performance.module_2_226

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature226Repository0 {
    private val dataSource = Feature226DataSource0()
    private val mapper = Feature226DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
