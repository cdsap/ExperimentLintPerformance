package com.performance.module_1_150

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature150Repository1 {
    private val dataSource = Feature150DataSource1()
    private val mapper = Feature150DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
