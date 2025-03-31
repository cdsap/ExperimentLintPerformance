package com.performance.module_0_4

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature4Repository0 {
    private val dataSource = Feature4DataSource0()
    private val mapper = Feature4DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
