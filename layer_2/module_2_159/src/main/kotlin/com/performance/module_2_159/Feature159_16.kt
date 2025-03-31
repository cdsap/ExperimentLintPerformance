package com.performance.module_2_159

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature159Repository1 {
    private val dataSource = Feature159DataSource1()
    private val mapper = Feature159DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
