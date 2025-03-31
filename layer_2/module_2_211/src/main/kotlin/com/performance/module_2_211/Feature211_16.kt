package com.performance.module_2_211

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature211Repository1 {
    private val dataSource = Feature211DataSource1()
    private val mapper = Feature211DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
