package com.performance.module_2_153

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature153Repository0 {
    private val dataSource = Feature153DataSource0()
    private val mapper = Feature153DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
