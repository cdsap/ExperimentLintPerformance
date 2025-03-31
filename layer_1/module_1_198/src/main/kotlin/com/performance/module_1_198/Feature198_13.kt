package com.performance.module_1_198

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature198Repository0 {
    private val dataSource = Feature198DataSource0()
    private val mapper = Feature198DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
