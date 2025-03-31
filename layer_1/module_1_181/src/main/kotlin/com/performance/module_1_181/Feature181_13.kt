package com.performance.module_1_181

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature181Repository0 {
    private val dataSource = Feature181DataSource0()
    private val mapper = Feature181DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
