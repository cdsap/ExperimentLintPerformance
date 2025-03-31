package com.performance.module_1_113

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature113Repository1 {
    private val dataSource = Feature113DataSource1()
    private val mapper = Feature113DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
