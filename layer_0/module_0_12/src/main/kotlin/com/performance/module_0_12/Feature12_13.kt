package com.performance.module_0_12

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature12Repository0 {
    private val dataSource = Feature12DataSource0()
    private val mapper = Feature12DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
