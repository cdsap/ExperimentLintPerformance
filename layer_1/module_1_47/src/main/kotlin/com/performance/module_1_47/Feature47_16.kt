package com.performance.module_1_47

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature47Repository1 {
    private val dataSource = Feature47DataSource1()
    private val mapper = Feature47DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
