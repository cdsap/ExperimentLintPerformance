package com.performance.module_3_54

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature54Repository1 {
    private val dataSource = Feature54DataSource1()
    private val mapper = Feature54DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
