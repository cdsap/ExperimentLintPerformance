package com.performance.module_2_220

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature220Repository2 {
    private val dataSource = Feature220DataSource2()
    private val mapper = Feature220DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
