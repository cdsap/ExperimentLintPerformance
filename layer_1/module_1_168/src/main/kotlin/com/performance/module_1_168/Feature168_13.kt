package com.performance.module_1_168

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature168Repository0 {
    private val dataSource = Feature168DataSource0()
    private val mapper = Feature168DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
