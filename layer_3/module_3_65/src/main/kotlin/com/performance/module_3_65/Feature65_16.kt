package com.performance.module_3_65

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature65Repository1 {
    private val dataSource = Feature65DataSource1()
    private val mapper = Feature65DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
