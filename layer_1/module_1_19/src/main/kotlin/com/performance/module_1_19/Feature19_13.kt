package com.performance.module_1_19

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature19Repository0 {
    private val dataSource = Feature19DataSource0()
    private val mapper = Feature19DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
