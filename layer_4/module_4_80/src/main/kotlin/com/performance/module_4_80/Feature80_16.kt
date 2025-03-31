package com.performance.module_4_80

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature80Repository1 {
    private val dataSource = Feature80DataSource1()
    private val mapper = Feature80DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
