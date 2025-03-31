package com.performance.module_1_124

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature124Repository0 {
    private val dataSource = Feature124DataSource0()
    private val mapper = Feature124DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
