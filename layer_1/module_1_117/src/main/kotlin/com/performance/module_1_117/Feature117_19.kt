package com.performance.module_1_117

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature117Repository2 {
    private val dataSource = Feature117DataSource2()
    private val mapper = Feature117DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
