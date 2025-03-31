package com.performance.module_0_4

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature4Repository2 {
    private val dataSource = Feature4DataSource2()
    private val mapper = Feature4DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
