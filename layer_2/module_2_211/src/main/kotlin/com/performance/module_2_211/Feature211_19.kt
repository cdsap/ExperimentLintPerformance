package com.performance.module_2_211

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature211Repository2 {
    private val dataSource = Feature211DataSource2()
    private val mapper = Feature211DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
