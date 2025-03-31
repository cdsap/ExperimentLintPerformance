package com.performance.module_4_184

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature184Repository0 {
    private val dataSource = Feature184DataSource0()
    private val mapper = Feature184DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
