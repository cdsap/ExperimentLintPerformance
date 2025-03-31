package com.performance.module_4_299

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature299Repository0 {
    private val dataSource = Feature299DataSource0()
    private val mapper = Feature299DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
