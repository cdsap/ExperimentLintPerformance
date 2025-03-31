package com.performance.module_0_85

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature85Repository1 {
    private val dataSource = Feature85DataSource1()
    private val mapper = Feature85DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
