package com.performance.module_2_135

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature135Repository0 {
    private val dataSource = Feature135DataSource0()
    private val mapper = Feature135DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
