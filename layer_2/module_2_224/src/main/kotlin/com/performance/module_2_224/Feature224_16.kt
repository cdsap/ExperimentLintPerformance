package com.performance.module_2_224

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature224Repository1 {
    private val dataSource = Feature224DataSource1()
    private val mapper = Feature224DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
