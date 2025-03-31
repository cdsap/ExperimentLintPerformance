package com.performance.module_0_106

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature106Repository2 {
    private val dataSource = Feature106DataSource2()
    private val mapper = Feature106DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
