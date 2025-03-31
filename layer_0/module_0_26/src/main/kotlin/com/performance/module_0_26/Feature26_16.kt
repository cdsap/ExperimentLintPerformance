package com.performance.module_0_26

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature26Repository1 {
    private val dataSource = Feature26DataSource1()
    private val mapper = Feature26DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
