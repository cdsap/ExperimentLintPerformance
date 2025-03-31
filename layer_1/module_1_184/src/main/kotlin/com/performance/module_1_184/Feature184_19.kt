package com.performance.module_1_184

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature184Repository2 {
    private val dataSource = Feature184DataSource2()
    private val mapper = Feature184DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
