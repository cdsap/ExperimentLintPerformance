package com.performance.module_0_71

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature71Repository2 {
    private val dataSource = Feature71DataSource2()
    private val mapper = Feature71DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
