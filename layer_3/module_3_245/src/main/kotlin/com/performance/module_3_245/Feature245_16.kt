package com.performance.module_3_245

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature245Repository1 {
    private val dataSource = Feature245DataSource1()
    private val mapper = Feature245DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
