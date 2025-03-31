package com.performance.module_0_111

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature111Repository0 {
    private val dataSource = Feature111DataSource0()
    private val mapper = Feature111DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
