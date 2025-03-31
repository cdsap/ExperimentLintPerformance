package com.performance.module_4_186

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature186Repository1 {
    private val dataSource = Feature186DataSource1()
    private val mapper = Feature186DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
