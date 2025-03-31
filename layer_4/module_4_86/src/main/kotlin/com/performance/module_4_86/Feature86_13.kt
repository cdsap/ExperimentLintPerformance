package com.performance.module_4_86

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature86Repository0 {
    private val dataSource = Feature86DataSource0()
    private val mapper = Feature86DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
