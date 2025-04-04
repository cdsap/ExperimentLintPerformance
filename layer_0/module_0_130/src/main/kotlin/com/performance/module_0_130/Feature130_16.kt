package com.performance.module_0_130

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature130Repository1 {
    private val dataSource = Feature130DataSource1()
    private val mapper = Feature130DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
