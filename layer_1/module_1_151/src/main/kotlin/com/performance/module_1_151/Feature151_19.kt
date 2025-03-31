package com.performance.module_1_151

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature151Repository2 {
    private val dataSource = Feature151DataSource2()
    private val mapper = Feature151DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
