package com.performance.module_0_41

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature41Repository0 {
    private val dataSource = Feature41DataSource0()
    private val mapper = Feature41DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
