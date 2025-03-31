package com.performance.module_3_183

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature183Repository1 {
    private val dataSource = Feature183DataSource1()
    private val mapper = Feature183DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
