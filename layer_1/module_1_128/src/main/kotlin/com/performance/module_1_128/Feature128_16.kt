package com.performance.module_1_128

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature128Repository1 {
    private val dataSource = Feature128DataSource1()
    private val mapper = Feature128DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
