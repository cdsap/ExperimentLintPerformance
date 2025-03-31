package com.performance.module_0_56

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature56Repository1 {
    private val dataSource = Feature56DataSource1()
    private val mapper = Feature56DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
