package com.performance.module_0_23

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature23Repository1 {
    private val dataSource = Feature23DataSource1()
    private val mapper = Feature23DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
