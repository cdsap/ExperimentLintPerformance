package com.performance.module_1_104

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature104Repository2 {
    private val dataSource = Feature104DataSource2()
    private val mapper = Feature104DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
