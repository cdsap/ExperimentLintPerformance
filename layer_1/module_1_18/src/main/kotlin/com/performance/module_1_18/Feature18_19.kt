package com.performance.module_1_18

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature18Repository2 {
    private val dataSource = Feature18DataSource2()
    private val mapper = Feature18DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
