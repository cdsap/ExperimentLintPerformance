package com.performance.module_2_224

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature224Repository0 {
    private val dataSource = Feature224DataSource0()
    private val mapper = Feature224DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
