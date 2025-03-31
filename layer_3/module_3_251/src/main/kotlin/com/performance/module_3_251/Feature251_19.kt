package com.performance.module_3_251

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature251Repository2 {
    private val dataSource = Feature251DataSource2()
    private val mapper = Feature251DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
