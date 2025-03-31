package com.performance.module_0_32

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature32Repository2 {
    private val dataSource = Feature32DataSource2()
    private val mapper = Feature32DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
