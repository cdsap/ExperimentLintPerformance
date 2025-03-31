package com.performance.module_3_256

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature256Repository2 {
    private val dataSource = Feature256DataSource2()
    private val mapper = Feature256DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
