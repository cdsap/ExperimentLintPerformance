package com.performance.module_0_21

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature21Repository1 {
    private val dataSource = Feature21DataSource1()
    private val mapper = Feature21DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
