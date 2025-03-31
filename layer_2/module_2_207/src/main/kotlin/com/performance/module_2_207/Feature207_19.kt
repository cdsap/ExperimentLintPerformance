package com.performance.module_2_207

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature207Repository2 {
    private val dataSource = Feature207DataSource2()
    private val mapper = Feature207DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
