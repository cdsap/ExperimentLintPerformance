package com.performance.module_1_106

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature106Repository0 {
    private val dataSource = Feature106DataSource0()
    private val mapper = Feature106DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
