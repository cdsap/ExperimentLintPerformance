package com.performance.module_0_87

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature87Repository0 {
    private val dataSource = Feature87DataSource0()
    private val mapper = Feature87DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
