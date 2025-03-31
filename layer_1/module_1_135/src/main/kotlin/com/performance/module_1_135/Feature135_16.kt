package com.performance.module_1_135

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature135Repository1 {
    private val dataSource = Feature135DataSource1()
    private val mapper = Feature135DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
