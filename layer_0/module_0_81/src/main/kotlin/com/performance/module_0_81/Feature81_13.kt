package com.performance.module_0_81

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature81Repository0 {
    private val dataSource = Feature81DataSource0()
    private val mapper = Feature81DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
