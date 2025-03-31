package com.performance.module_2_207

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature207Repository1 {
    private val dataSource = Feature207DataSource1()
    private val mapper = Feature207DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
