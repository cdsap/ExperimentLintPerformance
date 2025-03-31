package com.performance.module_0_112

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature112Repository1 {
    private val dataSource = Feature112DataSource1()
    private val mapper = Feature112DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
