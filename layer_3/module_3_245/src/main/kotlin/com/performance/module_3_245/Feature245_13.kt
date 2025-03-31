package com.performance.module_3_245

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature245Repository0 {
    private val dataSource = Feature245DataSource0()
    private val mapper = Feature245DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
