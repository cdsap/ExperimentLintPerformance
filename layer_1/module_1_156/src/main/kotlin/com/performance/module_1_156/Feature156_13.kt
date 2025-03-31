package com.performance.module_1_156

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature156Repository0 {
    private val dataSource = Feature156DataSource0()
    private val mapper = Feature156DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
