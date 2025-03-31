package com.performance.module_0_54

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature54Repository2 {
    private val dataSource = Feature54DataSource2()
    private val mapper = Feature54DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
