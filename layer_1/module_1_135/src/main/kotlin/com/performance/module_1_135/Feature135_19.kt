package com.performance.module_1_135

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature135Repository2 {
    private val dataSource = Feature135DataSource2()
    private val mapper = Feature135DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
