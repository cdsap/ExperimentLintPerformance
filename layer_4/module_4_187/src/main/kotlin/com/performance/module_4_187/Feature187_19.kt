package com.performance.module_4_187

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature187Repository2 {
    private val dataSource = Feature187DataSource2()
    private val mapper = Feature187DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
