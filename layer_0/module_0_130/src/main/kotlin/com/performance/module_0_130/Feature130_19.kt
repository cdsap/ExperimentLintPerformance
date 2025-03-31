package com.performance.module_0_130

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature130Repository2 {
    private val dataSource = Feature130DataSource2()
    private val mapper = Feature130DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
