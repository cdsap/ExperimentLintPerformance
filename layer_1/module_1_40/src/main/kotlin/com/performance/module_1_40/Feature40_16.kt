package com.performance.module_1_40

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature40Repository1 {
    private val dataSource = Feature40DataSource1()
    private val mapper = Feature40DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
