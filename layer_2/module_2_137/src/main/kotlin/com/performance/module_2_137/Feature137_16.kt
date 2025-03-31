package com.performance.module_2_137

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature137Repository1 {
    private val dataSource = Feature137DataSource1()
    private val mapper = Feature137DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
