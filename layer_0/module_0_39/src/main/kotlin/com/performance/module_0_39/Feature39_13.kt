package com.performance.module_0_39

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature39Repository0 {
    private val dataSource = Feature39DataSource0()
    private val mapper = Feature39DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
