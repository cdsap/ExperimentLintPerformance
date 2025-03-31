package com.performance.module_0_127

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature127Repository0 {
    private val dataSource = Feature127DataSource0()
    private val mapper = Feature127DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
