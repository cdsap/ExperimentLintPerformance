package com.performance.module_1_157

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature157Repository1 {
    private val dataSource = Feature157DataSource1()
    private val mapper = Feature157DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
