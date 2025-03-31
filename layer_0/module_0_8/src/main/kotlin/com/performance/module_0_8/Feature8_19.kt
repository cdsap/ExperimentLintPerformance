package com.performance.module_0_8

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature8Repository2 {
    private val dataSource = Feature8DataSource2()
    private val mapper = Feature8DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
