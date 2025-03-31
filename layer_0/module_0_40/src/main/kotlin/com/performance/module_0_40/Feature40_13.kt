package com.performance.module_0_40

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature40Repository0 {
    private val dataSource = Feature40DataSource0()
    private val mapper = Feature40DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
