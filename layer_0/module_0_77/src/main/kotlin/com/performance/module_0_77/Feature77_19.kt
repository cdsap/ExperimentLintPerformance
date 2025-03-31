package com.performance.module_0_77

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature77Repository2 {
    private val dataSource = Feature77DataSource2()
    private val mapper = Feature77DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
