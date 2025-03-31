package com.performance.module_2_218

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature218Repository2 {
    private val dataSource = Feature218DataSource2()
    private val mapper = Feature218DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
