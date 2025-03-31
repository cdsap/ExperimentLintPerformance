package com.performance.module_1_91

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature91Repository1 {
    private val dataSource = Feature91DataSource1()
    private val mapper = Feature91DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
