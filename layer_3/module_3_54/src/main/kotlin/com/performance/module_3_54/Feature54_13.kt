package com.performance.module_3_54

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature54Repository0 {
    private val dataSource = Feature54DataSource0()
    private val mapper = Feature54DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
