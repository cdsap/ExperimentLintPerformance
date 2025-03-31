package com.performance.module_3_52

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature52Repository2 {
    private val dataSource = Feature52DataSource2()
    private val mapper = Feature52DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
