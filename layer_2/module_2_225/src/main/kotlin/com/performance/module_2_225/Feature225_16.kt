package com.performance.module_2_225

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature225Repository1 {
    private val dataSource = Feature225DataSource1()
    private val mapper = Feature225DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
