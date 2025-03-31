package com.performance.module_0_14

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature14Repository0 {
    private val dataSource = Feature14DataSource0()
    private val mapper = Feature14DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
