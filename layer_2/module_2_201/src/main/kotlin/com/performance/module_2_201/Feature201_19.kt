package com.performance.module_2_201

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature201Repository2 {
    private val dataSource = Feature201DataSource2()
    private val mapper = Feature201DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
