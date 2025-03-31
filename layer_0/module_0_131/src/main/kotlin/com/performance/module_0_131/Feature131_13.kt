package com.performance.module_0_131

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature131Repository0 {
    private val dataSource = Feature131DataSource0()
    private val mapper = Feature131DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
