package com.performance.module_2_221

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature221Repository0 {
    private val dataSource = Feature221DataSource0()
    private val mapper = Feature221DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
