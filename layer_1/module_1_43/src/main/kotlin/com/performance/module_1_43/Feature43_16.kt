package com.performance.module_1_43

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature43Repository1 {
    private val dataSource = Feature43DataSource1()
    private val mapper = Feature43DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
