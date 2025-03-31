package com.performance.module_0_8

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature8Repository1 {
    private val dataSource = Feature8DataSource1()
    private val mapper = Feature8DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
