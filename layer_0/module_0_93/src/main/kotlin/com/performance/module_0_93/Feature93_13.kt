package com.performance.module_0_93

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature93Repository0 {
    private val dataSource = Feature93DataSource0()
    private val mapper = Feature93DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
