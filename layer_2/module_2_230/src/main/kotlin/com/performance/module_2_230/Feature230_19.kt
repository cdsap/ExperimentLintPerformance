package com.performance.module_2_230

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature230Repository2 {
    private val dataSource = Feature230DataSource2()
    private val mapper = Feature230DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
