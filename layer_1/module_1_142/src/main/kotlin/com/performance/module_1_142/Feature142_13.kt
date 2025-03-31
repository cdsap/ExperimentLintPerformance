package com.performance.module_1_142

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature142Repository0 {
    private val dataSource = Feature142DataSource0()
    private val mapper = Feature142DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
