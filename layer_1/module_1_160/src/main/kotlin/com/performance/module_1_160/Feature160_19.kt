package com.performance.module_1_160

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature160Repository2 {
    private val dataSource = Feature160DataSource2()
    private val mapper = Feature160DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
