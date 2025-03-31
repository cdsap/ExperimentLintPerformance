package com.performance.module_2_225

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature225Repository0 {
    private val dataSource = Feature225DataSource0()
    private val mapper = Feature225DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
