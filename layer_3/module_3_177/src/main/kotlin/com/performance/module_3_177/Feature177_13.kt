package com.performance.module_3_177

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature177Repository0 {
    private val dataSource = Feature177DataSource0()
    private val mapper = Feature177DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
