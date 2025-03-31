package com.performance.module_0_32

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature32Repository1 {
    private val dataSource = Feature32DataSource1()
    private val mapper = Feature32DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
