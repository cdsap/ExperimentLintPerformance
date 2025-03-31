package com.performance.module_1_111

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature111Repository2 {
    private val dataSource = Feature111DataSource2()
    private val mapper = Feature111DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
