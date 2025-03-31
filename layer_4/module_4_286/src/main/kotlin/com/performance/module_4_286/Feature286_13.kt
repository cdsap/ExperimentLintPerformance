package com.performance.module_4_286

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature286Repository0 {
    private val dataSource = Feature286DataSource0()
    private val mapper = Feature286DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
