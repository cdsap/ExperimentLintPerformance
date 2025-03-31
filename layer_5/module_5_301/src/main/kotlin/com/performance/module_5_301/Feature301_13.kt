package com.performance.module_5_301

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature301Repository0 {
    private val dataSource = Feature301DataSource0()
    private val mapper = Feature301DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
