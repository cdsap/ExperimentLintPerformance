package com.performance.module_0_84

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature84Repository1 {
    private val dataSource = Feature84DataSource1()
    private val mapper = Feature84DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
