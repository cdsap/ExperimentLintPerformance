package com.performance.module_2_160

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature160Repository1 {
    private val dataSource = Feature160DataSource1()
    private val mapper = Feature160DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
