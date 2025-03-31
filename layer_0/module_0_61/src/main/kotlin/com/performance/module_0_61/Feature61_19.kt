package com.performance.module_0_61

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature61Repository2 {
    private val dataSource = Feature61DataSource2()
    private val mapper = Feature61DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
