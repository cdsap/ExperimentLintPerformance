package com.performance.module_3_58

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature58Repository1 {
    private val dataSource = Feature58DataSource1()
    private val mapper = Feature58DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
