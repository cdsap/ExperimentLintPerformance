package com.performance.module_2_133

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature133Repository0 {
    private val dataSource = Feature133DataSource0()
    private val mapper = Feature133DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
