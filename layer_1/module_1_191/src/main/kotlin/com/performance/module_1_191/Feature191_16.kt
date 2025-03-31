package com.performance.module_1_191

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature191Repository1 {
    private val dataSource = Feature191DataSource1()
    private val mapper = Feature191DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
