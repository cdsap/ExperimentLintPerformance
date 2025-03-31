package com.performance.module_1_117

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature117Repository1 {
    private val dataSource = Feature117DataSource1()
    private val mapper = Feature117DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
