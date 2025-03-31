package com.performance.module_2_162

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature162Repository2 {
    private val dataSource = Feature162DataSource2()
    private val mapper = Feature162DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
