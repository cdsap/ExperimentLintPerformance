package com.performance.module_4_284

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature284Repository1 {
    private val dataSource = Feature284DataSource1()
    private val mapper = Feature284DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
