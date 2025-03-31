package com.performance.module_2_205

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature205Repository2 {
    private val dataSource = Feature205DataSource2()
    private val mapper = Feature205DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
