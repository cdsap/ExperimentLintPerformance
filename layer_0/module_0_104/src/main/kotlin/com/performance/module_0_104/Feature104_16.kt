package com.performance.module_0_104

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature104Repository1 {
    private val dataSource = Feature104DataSource1()
    private val mapper = Feature104DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
