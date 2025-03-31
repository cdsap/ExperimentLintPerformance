package com.performance.module_0_2

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature2Repository2 {
    private val dataSource = Feature2DataSource2()
    private val mapper = Feature2DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
