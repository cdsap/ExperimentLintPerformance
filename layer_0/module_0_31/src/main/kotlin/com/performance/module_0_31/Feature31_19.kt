package com.performance.module_0_31

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature31Repository2 {
    private val dataSource = Feature31DataSource2()
    private val mapper = Feature31DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
