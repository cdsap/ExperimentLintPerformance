package com.performance.module_4_290

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature290Repository1 {
    private val dataSource = Feature290DataSource1()
    private val mapper = Feature290DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
