package com.performance.module_4_198

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature198Repository2 {
    private val dataSource = Feature198DataSource2()
    private val mapper = Feature198DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
