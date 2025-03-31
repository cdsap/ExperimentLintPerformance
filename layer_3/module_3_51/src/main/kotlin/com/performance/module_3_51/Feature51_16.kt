package com.performance.module_3_51

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature51Repository1 {
    private val dataSource = Feature51DataSource1()
    private val mapper = Feature51DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
