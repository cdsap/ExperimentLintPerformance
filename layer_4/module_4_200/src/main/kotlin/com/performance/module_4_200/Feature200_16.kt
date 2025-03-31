package com.performance.module_4_200

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature200Repository1 {
    private val dataSource = Feature200DataSource1()
    private val mapper = Feature200DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
