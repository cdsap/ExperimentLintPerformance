package com.performance.module_1_39

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature39Repository2 {
    private val dataSource = Feature39DataSource2()
    private val mapper = Feature39DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
