package com.performance.module_3_71

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature71Repository1 {
    private val dataSource = Feature71DataSource1()
    private val mapper = Feature71DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
