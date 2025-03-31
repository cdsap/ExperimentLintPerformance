package com.performance.module_1_144

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature144Repository0 {
    private val dataSource = Feature144DataSource0()
    private val mapper = Feature144DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
