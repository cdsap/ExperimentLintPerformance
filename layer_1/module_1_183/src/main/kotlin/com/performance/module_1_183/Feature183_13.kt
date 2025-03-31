package com.performance.module_1_183

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature183Repository0 {
    private val dataSource = Feature183DataSource0()
    private val mapper = Feature183DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
