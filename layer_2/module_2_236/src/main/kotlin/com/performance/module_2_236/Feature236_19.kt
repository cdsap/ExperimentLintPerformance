package com.performance.module_2_236

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature236Repository2 {
    private val dataSource = Feature236DataSource2()
    private val mapper = Feature236DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
