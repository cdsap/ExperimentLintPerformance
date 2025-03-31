package com.performance.module_0_9

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature9Repository0 {
    private val dataSource = Feature9DataSource0()
    private val mapper = Feature9DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
