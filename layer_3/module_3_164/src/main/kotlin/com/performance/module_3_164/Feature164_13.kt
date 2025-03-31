package com.performance.module_3_164

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature164Repository0 {
    private val dataSource = Feature164DataSource0()
    private val mapper = Feature164DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
