package com.performance.module_2_235

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature235Repository2 {
    private val dataSource = Feature235DataSource2()
    private val mapper = Feature235DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
