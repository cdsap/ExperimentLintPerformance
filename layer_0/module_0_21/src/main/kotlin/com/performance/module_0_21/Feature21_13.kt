package com.performance.module_0_21

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature21Repository0 {
    private val dataSource = Feature21DataSource0()
    private val mapper = Feature21DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
