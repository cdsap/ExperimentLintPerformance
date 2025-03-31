package com.performance.module_1_94

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature94Repository2 {
    private val dataSource = Feature94DataSource2()
    private val mapper = Feature94DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
