package com.performance.module_2_139

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature139Repository0 {
    private val dataSource = Feature139DataSource0()
    private val mapper = Feature139DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
