package com.performance.module_0_52

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature52Repository1 {
    private val dataSource = Feature52DataSource1()
    private val mapper = Feature52DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
