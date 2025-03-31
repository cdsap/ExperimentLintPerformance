package com.performance.module_0_74

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature74Repository0 {
    private val dataSource = Feature74DataSource0()
    private val mapper = Feature74DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
