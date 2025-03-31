package com.performance.module_0_27

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature27Repository1 {
    private val dataSource = Feature27DataSource1()
    private val mapper = Feature27DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
