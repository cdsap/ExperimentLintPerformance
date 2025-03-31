package com.performance.module_3_177

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature177Repository1 {
    private val dataSource = Feature177DataSource1()
    private val mapper = Feature177DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
