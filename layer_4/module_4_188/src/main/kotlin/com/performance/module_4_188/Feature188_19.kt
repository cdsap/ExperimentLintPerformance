package com.performance.module_4_188

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature188Repository2 {
    private val dataSource = Feature188DataSource2()
    private val mapper = Feature188DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
