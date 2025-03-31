package com.performance.module_2_222

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature222Repository0 {
    private val dataSource = Feature222DataSource0()
    private val mapper = Feature222DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
