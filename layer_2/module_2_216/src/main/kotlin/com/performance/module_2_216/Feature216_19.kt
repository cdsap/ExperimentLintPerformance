package com.performance.module_2_216

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature216Repository2 {
    private val dataSource = Feature216DataSource2()
    private val mapper = Feature216DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
