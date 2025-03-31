package com.performance.module_0_15

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature15Repository2 {
    private val dataSource = Feature15DataSource2()
    private val mapper = Feature15DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
