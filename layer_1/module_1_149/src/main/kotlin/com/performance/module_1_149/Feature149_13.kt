package com.performance.module_1_149

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature149Repository0 {
    private val dataSource = Feature149DataSource0()
    private val mapper = Feature149DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
