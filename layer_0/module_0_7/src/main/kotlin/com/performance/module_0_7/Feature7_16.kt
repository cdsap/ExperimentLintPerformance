package com.performance.module_0_7

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature7Repository1 {
    private val dataSource = Feature7DataSource1()
    private val mapper = Feature7DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
