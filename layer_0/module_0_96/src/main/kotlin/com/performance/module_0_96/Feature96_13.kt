package com.performance.module_0_96

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature96Repository0 {
    private val dataSource = Feature96DataSource0()
    private val mapper = Feature96DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
