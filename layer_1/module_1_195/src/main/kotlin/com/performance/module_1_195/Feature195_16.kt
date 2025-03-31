package com.performance.module_1_195

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature195Repository1 {
    private val dataSource = Feature195DataSource1()
    private val mapper = Feature195DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
