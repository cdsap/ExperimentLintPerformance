package com.performance.module_0_17

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature17Repository0 {
    private val dataSource = Feature17DataSource0()
    private val mapper = Feature17DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
