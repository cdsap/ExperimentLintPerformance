package com.performance.module_3_249

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature249Repository2 {
    private val dataSource = Feature249DataSource2()
    private val mapper = Feature249DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
