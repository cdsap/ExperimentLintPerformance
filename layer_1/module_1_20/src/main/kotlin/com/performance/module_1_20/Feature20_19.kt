package com.performance.module_1_20

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature20Repository2 {
    private val dataSource = Feature20DataSource2()
    private val mapper = Feature20DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
