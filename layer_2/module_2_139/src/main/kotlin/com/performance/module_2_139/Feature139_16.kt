package com.performance.module_2_139

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature139Repository1 {
    private val dataSource = Feature139DataSource1()
    private val mapper = Feature139DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
