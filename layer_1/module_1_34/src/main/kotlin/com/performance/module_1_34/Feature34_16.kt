package com.performance.module_1_34

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature34Repository1 {
    private val dataSource = Feature34DataSource1()
    private val mapper = Feature34DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
