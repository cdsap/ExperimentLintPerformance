package com.performance.module_1_156

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature156Repository1 {
    private val dataSource = Feature156DataSource1()
    private val mapper = Feature156DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
