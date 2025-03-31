package com.performance.module_1_188

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature188Repository1 {
    private val dataSource = Feature188DataSource1()
    private val mapper = Feature188DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
