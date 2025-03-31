package com.performance.module_2_230

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature230Repository0 {
    private val dataSource = Feature230DataSource0()
    private val mapper = Feature230DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
