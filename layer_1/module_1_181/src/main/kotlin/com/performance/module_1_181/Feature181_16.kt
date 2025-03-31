package com.performance.module_1_181

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature181Repository1 {
    private val dataSource = Feature181DataSource1()
    private val mapper = Feature181DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
