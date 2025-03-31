package com.performance.module_0_121

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature121Repository0 {
    private val dataSource = Feature121DataSource0()
    private val mapper = Feature121DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
