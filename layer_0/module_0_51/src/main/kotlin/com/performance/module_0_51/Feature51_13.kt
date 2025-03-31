package com.performance.module_0_51

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature51Repository0 {
    private val dataSource = Feature51DataSource0()
    private val mapper = Feature51DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
