package com.performance.module_4_295

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature295Repository2 {
    private val dataSource = Feature295DataSource2()
    private val mapper = Feature295DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
