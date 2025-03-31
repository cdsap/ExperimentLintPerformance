package com.performance.module_4_290

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature290Repository2 {
    private val dataSource = Feature290DataSource2()
    private val mapper = Feature290DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
