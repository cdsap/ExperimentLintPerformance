package com.performance.module_2_205

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature205Repository1 {
    private val dataSource = Feature205DataSource1()
    private val mapper = Feature205DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
