package com.performance.module_1_29

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature29Repository1 {
    private val dataSource = Feature29DataSource1()
    private val mapper = Feature29DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
