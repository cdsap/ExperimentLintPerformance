package com.performance.module_0_84

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature84Repository2 {
    private val dataSource = Feature84DataSource2()
    private val mapper = Feature84DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
