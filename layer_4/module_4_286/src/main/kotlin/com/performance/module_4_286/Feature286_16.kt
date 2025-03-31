package com.performance.module_4_286

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature286Repository1 {
    private val dataSource = Feature286DataSource1()
    private val mapper = Feature286DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
