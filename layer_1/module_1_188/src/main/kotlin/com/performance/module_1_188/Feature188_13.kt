package com.performance.module_1_188

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature188Repository0 {
    private val dataSource = Feature188DataSource0()
    private val mapper = Feature188DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
