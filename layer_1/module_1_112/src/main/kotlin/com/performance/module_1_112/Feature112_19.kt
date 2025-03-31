package com.performance.module_1_112

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature112Repository2 {
    private val dataSource = Feature112DataSource2()
    private val mapper = Feature112DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
