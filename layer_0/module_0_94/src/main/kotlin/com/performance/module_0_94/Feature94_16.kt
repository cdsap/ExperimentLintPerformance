package com.performance.module_0_94

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature94Repository1 {
    private val dataSource = Feature94DataSource1()
    private val mapper = Feature94DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
