package com.performance.module_0_6

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature6Repository0 {
    private val dataSource = Feature6DataSource0()
    private val mapper = Feature6DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
