package com.performance.module_0_20

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature20Repository1 {
    private val dataSource = Feature20DataSource1()
    private val mapper = Feature20DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
