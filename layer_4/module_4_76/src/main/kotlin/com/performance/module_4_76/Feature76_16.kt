package com.performance.module_4_76

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature76Repository1 {
    private val dataSource = Feature76DataSource1()
    private val mapper = Feature76DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
