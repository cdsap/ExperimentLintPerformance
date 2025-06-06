package com.performance.module_2_201

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature201Repository0 {
    private val dataSource = Feature201DataSource0()
    private val mapper = Feature201DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
