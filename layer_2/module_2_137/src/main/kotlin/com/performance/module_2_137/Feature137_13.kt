package com.performance.module_2_137

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature137Repository0 {
    private val dataSource = Feature137DataSource0()
    private val mapper = Feature137DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
