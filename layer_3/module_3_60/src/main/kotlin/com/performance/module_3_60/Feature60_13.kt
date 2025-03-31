package com.performance.module_3_60

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature60Repository0 {
    private val dataSource = Feature60DataSource0()
    private val mapper = Feature60DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
