package com.performance.module_2_235

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature235Repository1 {
    private val dataSource = Feature235DataSource1()
    private val mapper = Feature235DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
