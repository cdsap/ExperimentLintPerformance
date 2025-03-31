package com.performance.module_4_198

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature198Repository1 {
    private val dataSource = Feature198DataSource1()
    private val mapper = Feature198DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
