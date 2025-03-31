package com.performance.module_1_98

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature98Repository0 {
    private val dataSource = Feature98DataSource0()
    private val mapper = Feature98DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
