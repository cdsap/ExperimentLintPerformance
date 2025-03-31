package com.performance.module_1_44

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature44Repository1 {
    private val dataSource = Feature44DataSource1()
    private val mapper = Feature44DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
