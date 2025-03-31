package com.performance.module_4_85

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature85Repository2 {
    private val dataSource = Feature85DataSource2()
    private val mapper = Feature85DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
