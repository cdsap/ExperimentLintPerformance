package com.performance.module_0_94

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature94Repository0 {
    private val dataSource = Feature94DataSource0()
    private val mapper = Feature94DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
