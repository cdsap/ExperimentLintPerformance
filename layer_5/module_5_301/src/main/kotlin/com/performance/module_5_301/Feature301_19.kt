package com.performance.module_5_301

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature301Repository2 {
    private val dataSource = Feature301DataSource2()
    private val mapper = Feature301DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
