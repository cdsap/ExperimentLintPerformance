package com.performance.module_2_145

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature145Repository1 {
    private val dataSource = Feature145DataSource1()
    private val mapper = Feature145DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
