package com.performance.module_3_245

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature245Repository2 {
    private val dataSource = Feature245DataSource2()
    private val mapper = Feature245DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
