package com.performance.module_0_49

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature49Repository1 {
    private val dataSource = Feature49DataSource1()
    private val mapper = Feature49DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
