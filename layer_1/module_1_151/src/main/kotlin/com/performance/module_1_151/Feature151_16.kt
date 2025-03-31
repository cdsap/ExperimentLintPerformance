package com.performance.module_1_151

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature151Repository1 {
    private val dataSource = Feature151DataSource1()
    private val mapper = Feature151DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
