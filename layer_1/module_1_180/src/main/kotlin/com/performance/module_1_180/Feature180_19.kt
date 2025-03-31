package com.performance.module_1_180

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature180Repository2 {
    private val dataSource = Feature180DataSource2()
    private val mapper = Feature180DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
