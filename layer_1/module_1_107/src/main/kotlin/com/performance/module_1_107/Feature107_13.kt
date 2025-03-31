package com.performance.module_1_107

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature107Repository0 {
    private val dataSource = Feature107DataSource0()
    private val mapper = Feature107DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
