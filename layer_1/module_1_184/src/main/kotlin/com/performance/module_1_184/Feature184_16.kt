package com.performance.module_1_184

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature184Repository1 {
    private val dataSource = Feature184DataSource1()
    private val mapper = Feature184DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
