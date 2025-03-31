package com.performance.module_3_171

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature171Repository0 {
    private val dataSource = Feature171DataSource0()
    private val mapper = Feature171DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
