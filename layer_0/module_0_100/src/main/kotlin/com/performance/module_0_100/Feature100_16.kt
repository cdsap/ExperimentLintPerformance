package com.performance.module_0_100

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature100Repository1 {
    private val dataSource = Feature100DataSource1()
    private val mapper = Feature100DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
