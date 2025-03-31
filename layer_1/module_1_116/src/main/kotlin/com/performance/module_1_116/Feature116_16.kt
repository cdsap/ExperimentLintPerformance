package com.performance.module_1_116

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature116Repository1 {
    private val dataSource = Feature116DataSource1()
    private val mapper = Feature116DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
