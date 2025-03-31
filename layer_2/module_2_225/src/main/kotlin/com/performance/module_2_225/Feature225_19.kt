package com.performance.module_2_225

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature225Repository2 {
    private val dataSource = Feature225DataSource2()
    private val mapper = Feature225DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
