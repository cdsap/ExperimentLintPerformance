package com.performance.module_1_162

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature162Repository0 {
    private val dataSource = Feature162DataSource0()
    private val mapper = Feature162DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
