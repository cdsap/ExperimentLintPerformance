package com.performance.module_4_77

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature77Repository1 {
    private val dataSource = Feature77DataSource1()
    private val mapper = Feature77DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
