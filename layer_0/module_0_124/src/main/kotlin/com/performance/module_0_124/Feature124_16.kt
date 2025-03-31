package com.performance.module_0_124

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature124Repository1 {
    private val dataSource = Feature124DataSource1()
    private val mapper = Feature124DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
