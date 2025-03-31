package com.performance.module_1_98

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature98Repository2 {
    private val dataSource = Feature98DataSource2()
    private val mapper = Feature98DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
