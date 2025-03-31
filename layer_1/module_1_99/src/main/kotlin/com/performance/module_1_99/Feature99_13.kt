package com.performance.module_1_99

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature99Repository0 {
    private val dataSource = Feature99DataSource0()
    private val mapper = Feature99DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
