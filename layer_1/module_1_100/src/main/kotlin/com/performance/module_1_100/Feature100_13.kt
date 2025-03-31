package com.performance.module_1_100

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature100Repository0 {
    private val dataSource = Feature100DataSource0()
    private val mapper = Feature100DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
