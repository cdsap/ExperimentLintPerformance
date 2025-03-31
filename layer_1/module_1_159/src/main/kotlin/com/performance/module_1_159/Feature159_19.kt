package com.performance.module_1_159

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature159Repository2 {
    private val dataSource = Feature159DataSource2()
    private val mapper = Feature159DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
