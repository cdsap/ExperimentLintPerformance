package com.performance.module_1_160

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature160Repository0 {
    private val dataSource = Feature160DataSource0()
    private val mapper = Feature160DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
