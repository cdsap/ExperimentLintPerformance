package com.performance.module_4_292

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature292Repository0 {
    private val dataSource = Feature292DataSource0()
    private val mapper = Feature292DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
