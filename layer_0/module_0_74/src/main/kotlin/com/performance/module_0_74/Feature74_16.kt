package com.performance.module_0_74

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature74Repository1 {
    private val dataSource = Feature74DataSource1()
    private val mapper = Feature74DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
