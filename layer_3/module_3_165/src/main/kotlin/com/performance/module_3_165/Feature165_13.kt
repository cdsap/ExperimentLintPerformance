package com.performance.module_3_165

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature165Repository0 {
    private val dataSource = Feature165DataSource0()
    private val mapper = Feature165DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
