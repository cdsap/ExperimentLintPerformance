package com.performance.module_1_187

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature187Repository0 {
    private val dataSource = Feature187DataSource0()
    private val mapper = Feature187DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
