package com.performance.module_0_81

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature81Repository1 {
    private val dataSource = Feature81DataSource1()
    private val mapper = Feature81DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
