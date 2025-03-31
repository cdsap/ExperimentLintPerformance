package com.performance.module_1_177

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature177Repository2 {
    private val dataSource = Feature177DataSource2()
    private val mapper = Feature177DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
