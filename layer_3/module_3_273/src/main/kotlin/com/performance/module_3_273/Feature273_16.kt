package com.performance.module_3_273

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature273Repository1 {
    private val dataSource = Feature273DataSource1()
    private val mapper = Feature273DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
