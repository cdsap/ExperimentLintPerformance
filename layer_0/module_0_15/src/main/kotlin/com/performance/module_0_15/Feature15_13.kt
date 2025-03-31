package com.performance.module_0_15

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature15Repository0 {
    private val dataSource = Feature15DataSource0()
    private val mapper = Feature15DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
