package com.performance.module_3_266

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature266Repository1 {
    private val dataSource = Feature266DataSource1()
    private val mapper = Feature266DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
