package com.performance.module_0_117

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature117Repository0 {
    private val dataSource = Feature117DataSource0()
    private val mapper = Feature117DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
