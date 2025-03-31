package com.performance.module_1_105

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature105Repository1 {
    private val dataSource = Feature105DataSource1()
    private val mapper = Feature105DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
