package com.performance.module_3_256

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature256Repository0 {
    private val dataSource = Feature256DataSource0()
    private val mapper = Feature256DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
