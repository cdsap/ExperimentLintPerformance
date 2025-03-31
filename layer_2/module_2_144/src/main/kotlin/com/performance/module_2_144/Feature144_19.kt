package com.performance.module_2_144

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature144Repository2 {
    private val dataSource = Feature144DataSource2()
    private val mapper = Feature144DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
