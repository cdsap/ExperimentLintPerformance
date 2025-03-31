package com.performance.module_2_212

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature212Repository0 {
    private val dataSource = Feature212DataSource0()
    private val mapper = Feature212DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
