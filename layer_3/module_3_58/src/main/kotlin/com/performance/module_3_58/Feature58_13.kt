package com.performance.module_3_58

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature58Repository0 {
    private val dataSource = Feature58DataSource0()
    private val mapper = Feature58DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
