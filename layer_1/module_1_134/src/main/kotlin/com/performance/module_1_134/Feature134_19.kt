package com.performance.module_1_134

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature134Repository2 {
    private val dataSource = Feature134DataSource2()
    private val mapper = Feature134DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
