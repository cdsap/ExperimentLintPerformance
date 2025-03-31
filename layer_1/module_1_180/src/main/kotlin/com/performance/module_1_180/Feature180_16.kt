package com.performance.module_1_180

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature180Repository1 {
    private val dataSource = Feature180DataSource1()
    private val mapper = Feature180DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
