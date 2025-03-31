package com.performance.module_1_43

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature43Repository2 {
    private val dataSource = Feature43DataSource2()
    private val mapper = Feature43DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
