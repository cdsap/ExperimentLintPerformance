package com.performance.module_1_110

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature110Repository0 {
    private val dataSource = Feature110DataSource0()
    private val mapper = Feature110DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
