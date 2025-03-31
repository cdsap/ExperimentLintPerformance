package com.performance.module_0_58

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature58Repository2 {
    private val dataSource = Feature58DataSource2()
    private val mapper = Feature58DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
