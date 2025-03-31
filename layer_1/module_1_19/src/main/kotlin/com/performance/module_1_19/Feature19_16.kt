package com.performance.module_1_19

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature19Repository1 {
    private val dataSource = Feature19DataSource1()
    private val mapper = Feature19DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
