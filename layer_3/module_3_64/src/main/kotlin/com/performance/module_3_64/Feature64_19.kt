package com.performance.module_3_64

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature64Repository2 {
    private val dataSource = Feature64DataSource2()
    private val mapper = Feature64DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
