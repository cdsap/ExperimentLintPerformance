package com.performance.module_1_137

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature137Repository2 {
    private val dataSource = Feature137DataSource2()
    private val mapper = Feature137DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
