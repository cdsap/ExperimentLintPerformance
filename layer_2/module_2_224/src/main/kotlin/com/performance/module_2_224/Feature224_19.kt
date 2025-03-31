package com.performance.module_2_224

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature224Repository2 {
    private val dataSource = Feature224DataSource2()
    private val mapper = Feature224DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
