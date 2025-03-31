package com.performance.module_4_187

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature187Repository1 {
    private val dataSource = Feature187DataSource1()
    private val mapper = Feature187DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
