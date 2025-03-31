package com.performance.module_3_246

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature246Repository0 {
    private val dataSource = Feature246DataSource0()
    private val mapper = Feature246DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
