package com.performance.module_0_13

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature13Repository0 {
    private val dataSource = Feature13DataSource0()
    private val mapper = Feature13DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
