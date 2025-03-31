package com.performance.module_2_204

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature204Repository1 {
    private val dataSource = Feature204DataSource1()
    private val mapper = Feature204DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
