package com.performance.module_2_212

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature212Repository1 {
    private val dataSource = Feature212DataSource1()
    private val mapper = Feature212DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
