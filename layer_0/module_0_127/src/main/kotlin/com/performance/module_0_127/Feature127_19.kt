package com.performance.module_0_127

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature127Repository2 {
    private val dataSource = Feature127DataSource2()
    private val mapper = Feature127DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
