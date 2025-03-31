package com.performance.module_3_273

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature273Repository2 {
    private val dataSource = Feature273DataSource2()
    private val mapper = Feature273DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
