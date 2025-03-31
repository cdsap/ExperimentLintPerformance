package com.performance.module_3_259

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature259Repository1 {
    private val dataSource = Feature259DataSource1()
    private val mapper = Feature259DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
