package com.performance.module_0_64

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature64Repository1 {
    private val dataSource = Feature64DataSource1()
    private val mapper = Feature64DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
