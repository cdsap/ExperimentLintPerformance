package com.performance.module_0_66

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature66Repository2 {
    private val dataSource = Feature66DataSource2()
    private val mapper = Feature66DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
