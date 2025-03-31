package com.performance.module_0_118

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature118Repository0 {
    private val dataSource = Feature118DataSource0()
    private val mapper = Feature118DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
