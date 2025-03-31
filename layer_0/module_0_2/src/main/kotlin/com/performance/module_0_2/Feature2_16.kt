package com.performance.module_0_2

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature2Repository1 {
    private val dataSource = Feature2DataSource1()
    private val mapper = Feature2DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
