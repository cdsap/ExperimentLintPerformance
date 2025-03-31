package com.performance.module_4_75

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature75Repository0 {
    private val dataSource = Feature75DataSource0()
    private val mapper = Feature75DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
