package com.performance.module_0_1

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature1Repository0 {
    private val dataSource = Feature1DataSource0()
    private val mapper = Feature1DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
