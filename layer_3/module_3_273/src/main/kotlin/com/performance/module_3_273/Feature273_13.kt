package com.performance.module_3_273

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature273Repository0 {
    private val dataSource = Feature273DataSource0()
    private val mapper = Feature273DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
