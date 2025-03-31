package com.performance.module_1_124

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature124Repository2 {
    private val dataSource = Feature124DataSource2()
    private val mapper = Feature124DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
