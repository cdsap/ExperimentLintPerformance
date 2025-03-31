package com.performance.module_2_220

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature220Repository1 {
    private val dataSource = Feature220DataSource1()
    private val mapper = Feature220DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
