package com.performance.module_0_111

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature111Repository1 {
    private val dataSource = Feature111DataSource1()
    private val mapper = Feature111DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
