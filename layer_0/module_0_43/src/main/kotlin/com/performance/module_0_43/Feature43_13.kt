package com.performance.module_0_43

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature43Repository0 {
    private val dataSource = Feature43DataSource0()
    private val mapper = Feature43DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
