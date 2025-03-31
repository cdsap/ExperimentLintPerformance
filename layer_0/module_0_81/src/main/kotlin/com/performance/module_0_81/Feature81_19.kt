package com.performance.module_0_81

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature81Repository2 {
    private val dataSource = Feature81DataSource2()
    private val mapper = Feature81DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
