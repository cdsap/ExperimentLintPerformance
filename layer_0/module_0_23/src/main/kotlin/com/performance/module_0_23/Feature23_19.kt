package com.performance.module_0_23

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature23Repository2 {
    private val dataSource = Feature23DataSource2()
    private val mapper = Feature23DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
