package com.performance.module_3_259

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature259Repository0 {
    private val dataSource = Feature259DataSource0()
    private val mapper = Feature259DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
