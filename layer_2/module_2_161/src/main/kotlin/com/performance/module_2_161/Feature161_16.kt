package com.performance.module_2_161

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature161Repository1 {
    private val dataSource = Feature161DataSource1()
    private val mapper = Feature161DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
