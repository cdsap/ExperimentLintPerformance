package com.performance.module_0_75

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature75Repository2 {
    private val dataSource = Feature75DataSource2()
    private val mapper = Feature75DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
