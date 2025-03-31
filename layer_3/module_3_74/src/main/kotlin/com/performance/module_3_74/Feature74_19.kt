package com.performance.module_3_74

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature74Repository2 {
    private val dataSource = Feature74DataSource2()
    private val mapper = Feature74DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
