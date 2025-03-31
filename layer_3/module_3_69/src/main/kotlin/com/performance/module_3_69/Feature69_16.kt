package com.performance.module_3_69

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature69Repository1 {
    private val dataSource = Feature69DataSource1()
    private val mapper = Feature69DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
