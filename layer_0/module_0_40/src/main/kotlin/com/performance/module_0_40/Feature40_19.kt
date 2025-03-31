package com.performance.module_0_40

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature40Repository2 {
    private val dataSource = Feature40DataSource2()
    private val mapper = Feature40DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
