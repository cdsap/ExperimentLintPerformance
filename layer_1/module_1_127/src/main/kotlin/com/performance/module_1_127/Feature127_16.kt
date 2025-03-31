package com.performance.module_1_127

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature127Repository1 {
    private val dataSource = Feature127DataSource1()
    private val mapper = Feature127DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
